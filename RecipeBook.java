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
    
    // Other methods go here
}