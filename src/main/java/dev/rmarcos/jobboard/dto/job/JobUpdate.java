package dev.rmarcos.jobboard.dto.job;

import dev.rmarcos.jobboard.domain.enums.ContractType;
import dev.rmarcos.jobboard.domain.enums.ExperienceLevel;
import dev.rmarcos.jobboard.domain.enums.JobLocation;
import dev.rmarcos.jobboard.domain.enums.SalaryType;
import jakarta.validation.constraints.NotBlank;

import java.util.Set;

public record JobUpdate(
    @NotBlank Long id,
    String title,
    String description,
    Long companyId,
    Set<String> skills,
    ExperienceLevel experienceLevel,
    ContractType contractType,
    JobLocation jobLocation,
    Integer minSalary,
    Integer maxSalary,
    SalaryType salaryType
) {
}
