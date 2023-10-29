// Write your code here

package com.example.recipe;

public interface RecipeRepository {
    ArrayList<Recipe> getAllRecipes();

    Recipe getRecipeById(int recipeId);

    Recipe addRecipe(Recipe recipe);

    Recipe updateRecipe(int recipeId, Recipe recipe);

    void deleteRecipe(int recipeId);
}