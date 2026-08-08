package dev.rmarcos.jobboard.dto.candidate;

import jakarta.validation.constraints.NotBlank;

import java.util.Set;

public record CandidateReadDTO(
        @NotBlank Long id,
        @NotBlank String firstName,
        @NotBlank String lastName,
        @NotBlank Set<String> skills,
        @NotBlank String summary
        ) {
}
