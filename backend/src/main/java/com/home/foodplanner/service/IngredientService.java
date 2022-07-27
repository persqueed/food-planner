package com.home.foodplanner.service;

import com.home.foodplanner.entity.Ingredient;
import com.home.foodplanner.repository.IngredientRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class IngredientService {

    private final IngredientRepository repository;

    public IngredientService(IngredientRepository repository) {
        this.repository = repository;
    }


    @Transactional
    public Ingredient saveIngredient(Ingredient ingredient) {
        return repository.save(ingredient);
    }

    @Transactional
    public List<Ingredient> saveIngredients(List<Ingredient> ingredients) {
        return repository.saveAll(ingredients);
    }

    @Transactional
    public List<Ingredient> getIngredients() {
        return repository.findAll();
    }

    @Transactional
    public Ingredient getIngredientById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Transactional
    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "Product removed " + id;
    }

//    public Ingredient updateIngredient(Ingredient ingredient) {
//        Ingredient existingIngredient = repository.findById(ingredient.getId()).orElse(null);
//        existingIngredient.setIngredientName(ingredient.getIngredientName());
//        existingIngredient.setQuantity(ingredient.getQuantity());
//        existingIngredient.setQuantityMeasurement(ingredient.getQuantityMeasurement());
//
//        return repository.save(existingIngredient);
//    }
}
