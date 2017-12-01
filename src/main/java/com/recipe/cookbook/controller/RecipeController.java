package com.recipe.cookbook.controller;

import com.recipe.cookbook.model.Recipe;
import com.recipe.cookbook.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by stiranardvanich on 01.12.2017.
 */

@Controller
@RequestMapping("api/recipes")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody List<Recipe> index() {
        return recipeService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody Recipe get(@PathVariable("id") Long id) {
        return recipeService.findOne(id);
    }

}
