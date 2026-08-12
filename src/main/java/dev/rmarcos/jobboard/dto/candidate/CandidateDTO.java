package dev.rmarcos.jobboard.dto.candidate;

import dev.rmarcos.jobboard.domain.enums.Gender;
import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.util.Set;

public record CandidateDTO(
    @NotBlank @Size(max = 50) @Pattern(regexp = "^[A-Za-z][A-Za-z\\s'\\-]{1,49}$") String firstName,
    @NotBlank @Size(max = 50) @Pattern(regexp = "^[A-Za-z][A-Za-z\\s'\\-]{1,49}$") String lastName,
    @NotBlank @Email String email,
    @NotBlank @Pattern(regexp = "^\\+?[1-9]\\d{6,14}$") String phoneNumber,
    @Past @NotBlank LocalDate birthDate,
    @NotBlank Gender gender,
    @NotBlank @Size(max = 500) String summary,
    @NotBlank Set<String> skills,
    @NotBlank @Size(min = 8, max = 64) String password
) { }
