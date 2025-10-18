package com.example.ecommerce.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductRequestDto {

    @NotNull(message = "Product name cannot be null")
    @Size(min = 20, max = 120, message = "Product name must be between 20 and 120 characters.")
    private String name;

    @NotNull(message = "Product description cannot be blank")
    @Size(min = 20, max = 3000, message = "Product description must be between 20 and 3000 characters.")
    private String description;

    @NotNull
    @DecimalMin(value = "0.00", inclusive = false, message = "Price is not valid.")
    @Digits(integer = 17, fraction = 2)
    private BigDecimal price;

    @NotNull
    @Min(value = 0)
    private Integer stock;
}
