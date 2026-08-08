package dev.rmarcos.jobboard.dto.company;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CompanyUpdateDTO (
    @NotBlank Long id,
    String name,
    String nif,
    String Summary,
    @Email String email,
    String phoneNumber,
    @Size(min = 8, max = 64) String password
){ }
