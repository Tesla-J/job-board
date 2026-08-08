package dev.rmarcos.jobboard.dto.candidate;

import dev.rmarcos.jobboard.domain.enums.Gender;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.util.Set;

public record CandidateDTO(
    @NotBlank String firstName,
    @NotBlank String lastName,
    @NotBlank @Email String email,
    @NotBlank String phoneNumber,
    @Past @NotBlank LocalDate birthDate,
    @NotBlank Gender gender,
    @NotBlank String summary,
    @NotBlank Set<String> skills,
    @NotBlank @Size(min = 8, max = 64) String password
) { }
