import java.util.List;

public class RecipeList {
    private List<Recipe> recipes;


    public RecipeList(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    public Recipe addRecipe(Recipe recipe) {
        recipes.add(recipe);

        return recipe;
    }


}
