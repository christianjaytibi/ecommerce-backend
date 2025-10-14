package com.example.ecommerce.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserRequestDto {

    @NotBlank
    @Size(min = 2, message = "Name must be of length 2 or more")
    private String name;

    @NotNull
    @Email
    private String email;

    @NotBlank
    @Size(min = 8, message = "Passwords must be of length 8 or more")
    private String password;
}
