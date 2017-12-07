package com.recipe.cookbook.service;

import com.recipe.cookbook.model.Recipe;
import com.recipe.cookbook.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

/**
 * Created by stiranardvanich on 01.12.2017.
 */

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    public List<Recipe> findAll() {
        return recipeRepository.findAll();
    }

    public Recipe findOne(Long id) {
        Assert.notNull(id, "Id must not be null");
        return recipeRepository.findOne(id);
    }

    public Recipe saveRecipe(Recipe recipe) {
        Assert.notNull(recipe, "Recipe must not be null");
        return recipeRepository.saveAndFlush(recipe);
    }
    
    public void deleteRecipe(Long id) {
        Assert.notNull(id, "ID must not be null");
        recipeRepository.delete(id);
    }
}
