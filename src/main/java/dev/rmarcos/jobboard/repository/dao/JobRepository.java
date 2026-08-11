package dev.rmarcos.jobboard.repository.dao;

import dev.rmarcos.jobboard.domain.enums.ContractType;
import dev.rmarcos.jobboard.domain.enums.ExperienceLevel;
import dev.rmarcos.jobboard.domain.enums.JobLocation;
import dev.rmarcos.jobboard.domain.enums.SalaryType;
import dev.rmarcos.jobboard.model.orm.JobORM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JobRepository extends JpaRepository<JobORM, Long> {
    @Query("FROM JobORM job WHERE job.title LIKE %:title%")
    List<JobORM> findByTitle(@Param("title") String title);

    List<JobORM> findByCompanyId(Long companyId);

    List<JobORM> findByExperienceLevel(ExperienceLevel experienceLevel);

    List<JobORM> findByContractType(ContractType contractType);

    List<JobORM> findByJobLocation(JobLocation jobLocation);

    @Query("""
            SELECT job
            FROM JobORM job
            WHERE job.minSalary >= :minSalary
            AND job.salaryType = :salaryType
    """)
    List<JobORM> findByMinSalary(
            @Param("minSalary") Long minSalary,
            @Param("salaryType") SalaryType salaryType
    );

    @Query("""
            SELECT job
            FROM JobORM job
            WHERE job.minSalary <= :maxSalary
            AND job.salaryType = :salaryType
    """)
    List<JobORM> findByMaxSalary(
            @Param("maxSalary") Long maxSalary,
            @Param("salaryType") SalaryType salaryType
    );
}
