package com.recipe.cookbook.controller;

import com.recipe.cookbook.model.Recipe;
import com.recipe.cookbook.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.validation.Valid;

/**
 * Created by stiranardvanich on 01.12.2017.
 */

@RestController
@RequestMapping("api/v1/recipes")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @GetMapping
    public @ResponseBody List<Recipe> index() {
        return recipeService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Recipe get(@PathVariable("id") Long id) {
        return recipeService.findOne(id);
    }
    
    @PostMapping(value = "/create")
    public Recipe add(@Valid @RequestBody Recipe recipe) {
    		return recipeService.saveRecipe(recipe);
    }
    
    @PutMapping(value = "/{id}")
    public Recipe update(@Valid @RequestBody Recipe recipe) {
    		return recipeService.saveRecipe(recipe);
    }
    
    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable Long id) {
    		recipeService.deleteRecipe(id);
    }

}
