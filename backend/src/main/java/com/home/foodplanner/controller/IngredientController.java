package com.home.foodplanner.controller;

import com.home.foodplanner.entity.Ingredient;
import com.home.foodplanner.service.IngredientService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import org.springframework.transaction.annotation.Transactional;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/ingredients")
public class IngredientController {

    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping()
    @Transactional(readOnly = true)
    public ResponseEntity<List<Ingredient>> getAllIngredients() {

       List<Ingredient> ingredients = ingredientService.getIngredients();

        return ResponseEntity.ok(ingredients.stream().toList());
    }

    @PostMapping()
    @Transactional(readOnly = true)
    public ResponseEntity<Ingredient> addIngredient(@RequestBody @Valid Ingredient ingredient) {

        Ingredient ingredient1 = ingredientService.saveIngredient(ingredient);
        return ResponseEntity.ok(ingredient1);
    }
}
