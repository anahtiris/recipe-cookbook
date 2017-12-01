package com.recipe.cookbook;

import com.recipe.cookbook.model.Recipe;
import com.recipe.cookbook.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by stiranardvanich on 01.12.2017.
 */

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class TestData {

    @Autowired
    private RecipeService recipeService;

    @PostConstruct
    public void insertTestData() {
        insertTestRecipes();
    }

    private void insertTestRecipes() {
        if (recipeService.findOne(1L) == null) {
            Recipe recipe1 = new Recipe();
            recipe1.setName("Scone");
            recipe1.setDescription("Devon scone with strawberry jam.");
            recipeService.saveRecipe(recipe1);
        }

        if (recipeService.findOne(2L) == null) {
            Recipe recipe2 = new Recipe();
            recipe2.setName("Crepe");
            recipe2.setDescription("French crepe.");
            recipeService.saveRecipe(recipe2);
        }
    }
}
