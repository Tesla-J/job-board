package dev.rmarcos.jobboard.dto.company;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record CompanyDTO(
    @NotBlank @Size(max = 50) String name,
    @NotBlank @Pattern( regexp = "\\d(10)]") String nif,
    @NotBlank @Size(max = 500) String Summary,
    @NotBlank @Email String email,
    @NotBlank @Pattern(regexp = "^\\+?[1-9]\\d{6,14}$") String phoneNumber,
    @NotBlank @Size(min = 8, max = 64) String password
) { }
