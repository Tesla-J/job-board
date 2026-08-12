package dev.rmarcos.jobboard.dto.authentication;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record LoginDTO(
        @NotBlank @Email @Size(max = 254) String email,
        @NotBlank @Size(min = 8, max = 60) String password
) {
}
