package dev.rmarcos.jobboard.dto.application;

import dev.rmarcos.jobboard.domain.enums.ApplicationStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;

public record ApplicationDTO(
    @NotBlank Long jobId,
    @NotBlank Long candidateId,
    @NotNull ApplicationStatus applicationStatus,
    @Past @NotNull LocalDate applicationDate
) { }
