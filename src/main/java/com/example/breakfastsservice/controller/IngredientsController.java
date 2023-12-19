package com.example.breakfastsservice.controller;

import com.example.breakfastsservice.entity.Ingredients;
import com.example.breakfastsservice.request.IngredientsRequest;
import com.example.breakfastsservice.service.IngredientsServiceImpl;
import jakarta.validation.Valid;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Getter
@Setter
@RequiredArgsConstructor
@RequestMapping("/api")
public class IngredientsController {
    private final IngredientsServiceImpl ingredientsService;

    @PostMapping("/ingredients")
    public ResponseEntity<Ingredients> createIngredient(@RequestParam Long breakfasts_id, @RequestBody @Valid IngredientsRequest ingredientsRequest) {
        return new ResponseEntity<>(ingredientsService.createIngredient(breakfasts_id, ingredientsRequest), HttpStatus.OK);
    }

    @PutMapping("/ingredients/{id}")
    public ResponseEntity<Ingredients> putIngredient(@PathVariable Long id, @RequestBody @Valid IngredientsRequest ingredientsRequest) {
        return new ResponseEntity<>(ingredientsService.putIngredient(id, ingredientsRequest), HttpStatus.OK);
    }

    @DeleteMapping("/ingredients/{id}")
    public HttpStatus deleteIngredient(@PathVariable Long id) {
        ingredientsService.deleteIngredient(id);
        return HttpStatus.OK;
    }
}
