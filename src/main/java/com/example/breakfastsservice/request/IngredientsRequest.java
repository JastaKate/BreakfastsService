package com.example.breakfastsservice.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class IngredientsRequest {

    @NotBlank
    private String product;
    @NotBlank
    private String amount;

}
