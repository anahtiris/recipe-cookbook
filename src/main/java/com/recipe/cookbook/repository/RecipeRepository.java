package com.recipe.cookbook.repository;

import com.recipe.cookbook.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by stiranardvanich on 01.12.2017.
 */
public interface RecipeRepository extends JpaRepository<Recipe, Long> {


}
