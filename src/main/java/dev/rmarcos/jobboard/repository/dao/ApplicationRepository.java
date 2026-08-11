package dev.rmarcos.jobboard.repository.dao;

import dev.rmarcos.jobboard.domain.enums.ApplicationStatus;
import dev.rmarcos.jobboard.model.orm.ApplicationORM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ApplicationRepository extends JpaRepository<ApplicationORM, Long> {
    List<ApplicationORM> findByJobIdAndCandidateId(Long jobId, Long candidateId);

    @Query("""
        FROM ApplicationORM application
        WHERE application.applicationStatus = :status
        AND application.candidate.id = :id
    """)
    List<ApplicationORM> findByApplicationStatusAndCandidateId(
            @Param("status") ApplicationStatus status,
            @Param("id") Long candidateId
    );

    //TODO sort from most recent applications
}
