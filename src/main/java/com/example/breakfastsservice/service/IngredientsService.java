package com.example.breakfastsservice.service;

import com.example.breakfastsservice.entity.Ingredients;
import com.example.breakfastsservice.request.IngredientsRequest;

public interface IngredientsService {
    Ingredients createIngredient(Long breakfasts_id, IngredientsRequest request);
    Ingredients putIngredient(Long ingredients_id, IngredientsRequest request);
    void deleteIngredient(Long id);
}
