package com.example.breakfastsservice.service;

import com.example.breakfastsservice.entity.Breakfasts;
import com.example.breakfastsservice.request.BreakfastsRequest;

import java.util.List;

public interface BreakfastsService {
    List<Breakfasts> getBreakfasts();
    Breakfasts createBreakfast(BreakfastsRequest request);
    Breakfasts putBreakfast(Breakfasts breakfasts);
    void deleteBreakfast(Long id);
}
