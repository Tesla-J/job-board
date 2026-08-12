package dev.rmarcos.jobboard.dto.job;

import dev.rmarcos.jobboard.domain.enums.ContractType;
import dev.rmarcos.jobboard.domain.enums.ExperienceLevel;
import dev.rmarcos.jobboard.domain.enums.JobLocation;
import dev.rmarcos.jobboard.domain.enums.SalaryType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Set;

public record JobDTO(
    @NotBlank @Size(max = 20) String title,
    @NotBlank @Size(max = 500) String description,
    @NotBlank Long companyId,
    @NotNull Set<String> skills,
    @NotNull ExperienceLevel experienceLevel,
    @NotNull ContractType contractType,
    @NotNull JobLocation jobLocation,
    @NotBlank Integer minSalary,
    @NotBlank Integer maxSalary,
    @NotNull SalaryType salaryType
) { }
