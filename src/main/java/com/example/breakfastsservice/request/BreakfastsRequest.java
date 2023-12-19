package com.example.breakfastsservice.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class BreakfastsRequest {
    @NotBlank
    private String name;
    @NotBlank
    private String category;
    @NotBlank
    private String time;
}
