package dev.rmarcos.jobboard.dto.candidate;

import dev.rmarcos.jobboard.domain.enums.Gender;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.util.Set;

public record CandidateUpdateDTO (
     @NotBlank Long id,
     String firstName,
     String lastName,
     @Email String email,
     String phoneNumber,
     @Past LocalDate birthDate,
     Gender gender,
     String summary,
     Set<String> skills,
     @Size(min = 8, max = 64) String password
){ }
