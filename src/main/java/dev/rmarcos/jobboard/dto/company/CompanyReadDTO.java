package dev.rmarcos.jobboard.dto.company;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CompanyReadDTO(
    @NotBlank Long id,
    @NotBlank String name,
    @NotBlank String summary,
    @NotBlank @Size(min = 10, max = 10) String nif
){
}
