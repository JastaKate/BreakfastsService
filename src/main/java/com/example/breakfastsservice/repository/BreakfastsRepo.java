package com.example.breakfastsservice.repository;

import com.example.breakfastsservice.entity.Breakfasts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BreakfastsRepo  extends JpaRepository<Breakfasts, Long> {
}
