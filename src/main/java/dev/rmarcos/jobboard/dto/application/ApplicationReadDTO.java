package dev.rmarcos.jobboard.dto.application;

import dev.rmarcos.jobboard.domain.enums.ApplicationStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;

public record ApplicationReadDTO(
    @NotBlank Long applicationId,
    @NotBlank Long jobId,
    @NotBlank Long candidateId,
    @NotBlank ApplicationStatus applicationStatus,
    @Past @NotBlank LocalDate applicationDate
) { }
