package com.example.breakfastsservice.repository;

import com.example.breakfastsservice.entity.Ingredients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientsRepo  extends JpaRepository<Ingredients, Long> {
}
