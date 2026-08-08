package dev.rmarcos.jobboard.dto.authentication;

import jakarta.validation.constraints.NotBlank;

public record Session(
    @NotBlank String sessionToken
) {
}
