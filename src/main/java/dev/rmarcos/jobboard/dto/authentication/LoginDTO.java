package dev.rmarcos.jobboard.dto.authentication;

import jakarta.validation.constraints.NotBlank;

public record LoginDTO(
    @NotBlank String email,
    @NotBlank String password
) {
}
