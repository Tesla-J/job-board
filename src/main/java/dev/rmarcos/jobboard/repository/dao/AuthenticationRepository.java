package dev.rmarcos.jobboard.repository.dao;

import dev.rmarcos.jobboard.model.orm.AuthenticationORM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthenticationRepository extends JpaRepository<AuthenticationORM, Long> {
    AuthenticationORM findByEmailAndPasswordHash(String email, String passwordHash);
}
