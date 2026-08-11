package dev.rmarcos.jobboard.repository.dao;

import dev.rmarcos.jobboard.model.orm.CandidateORM;
import dev.rmarcos.jobboard.model.orm.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;

public interface CandidateRepository extends JpaRepository<CandidateORM, Long> {
    List<CandidateORM> findByFirstName(String firstName);

    List<CandidateORM> findByLastName(String lastName);

    @Query("""
            FROM CandidateORM candidate
            WHERE candidate.firstName = :first_name
            AND candidate.lastName = :last_name"""
    )
    List<CandidateORM> findByFullName(
            @Param("first_name") String firstName,
            @Param("last_name") String lastName
    );

    @Query("""
            SELECT DISTINCT candidate
            FROM CandidateORM candidate
            JOIN candidate.skills skills
            WHERE skills.id in :skillIds
    """)
    List<CandidateORM> findBySkills(@Param("skillIds") Set<Long> skillIds);
    // TODO sort by best matching and summary keywords
}
