package dev.rmarcos.jobboard.dto.company;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CompanyDTO(
    @NotBlank String name,
    @NotBlank String nif,
    @NotBlank String Summary,
    @NotBlank @Email String email,
    @NotBlank String phoneNumber,
    @NotBlank @Size(min = 8, max = 64) String password
) { }
