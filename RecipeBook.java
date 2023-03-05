import java.io.*;

//class
public class Recipe {
    //private instance
    private String recipeName;
    private ArrayList<String> ingredients;
    private String instructions;

    //cunstructor
    public Recipe(String recipeName, ArrayList<String> ingredients, String instructions){
        // refere private instance
        this.recipeName = recipeName;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    //Getter methods
    public String getRecipeName(){
        return recipeName;
    }
    //Getter methods
    public ArrayList<String> getIngredients() {
        return ingredients;
    }
    //Getter methods
    public String getInstructions() {
        return instructions;
    }
    
    // Setter methods
    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }
    // Setter methods
    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }
    // Setter methods
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

}

public class RecipeBook {
    private ArrayList<Recipe> recipes;

    public RecipeBook() {
        recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }
    
    public Recipe getRecipe(int index) {
        return recipes.get(index);
    }

    public ArrayList<Recipe> searchRecipes(String searchTerm) {
        ArrayList<Recipe> matchingRecipes = new ArrayList<>();
        for (Recipe recipe : recipes) {
            if (recipe.getRecipeName().toLowerCase().contains(searchTerm.toLowerCase()) || 
                recipe.getIngredients().toString().toLowerCase().contains(searchTerm.toLowerCase())) {
                matchingRecipes.add(recipe);
            }
        }
        return matchingRecipes;
    }

    public void deleteRecipe(Recipe recipe) {
        recipes.remove(recipe);
    }

    public void updateRecipe(Recipe oldRecipe, Recipe newRecipe) {
        int index = recipes.indexOf(oldRecipe);
        if (index != -1) {
            recipes.set(index, newRecipe);
        }
    }

    public void saveToFile(String fileName) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(recipes);
        oos.close();
    }
    
    public void loadFromFile(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        recipes = (ArrayList<Recipe>) ois.readObject();
        ois.close();
    }
    // Other methods go here
}