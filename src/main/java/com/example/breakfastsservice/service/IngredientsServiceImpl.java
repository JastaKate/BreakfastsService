package com.example.breakfastsservice.service;

import com.example.breakfastsservice.entity.Breakfasts;
import com.example.breakfastsservice.entity.Ingredients;
import com.example.breakfastsservice.repository.IngredientsRepo;
import com.example.breakfastsservice.request.IngredientsRequest;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IngredientsServiceImpl implements IngredientsService{
    @PersistenceContext
    private EntityManager entityManager;
    private final IngredientsRepo ingredientsRepo;

    @Override
    public Ingredients createIngredient(Long breakfasts_id, IngredientsRequest request) {
        Breakfasts breakfasts = entityManager.getReference(Breakfasts.class, breakfasts_id);
        return ingredientsRepo.save(Ingredients.builder()
                .breakfasts(breakfasts)
                .product(request.getProduct())
                .amount(request.getAmount())
                .build());
    }

    @Override
    public Ingredients putIngredient(Long ingredients_id, IngredientsRequest request) {
        Ingredients brIngredients = ingredientsRepo.findById(ingredients_id).get();
        brIngredients.setProduct(request.getProduct());
        brIngredients.setAmount(request.getAmount());
        return ingredientsRepo.save(brIngredients);
    }

    @Override
    public void deleteIngredient(Long id) {
        ingredientsRepo.deleteById(id);
    }
}
