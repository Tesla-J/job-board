package dev.rmarcos.jobboard.repository.dao;

import dev.rmarcos.jobboard.model.orm.CompanyORM;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompanyRepository extends JpaRepository<CompanyORM, Long> {
    List<CompanyORM> findByName(String name);

    List<CompanyORM> findByNif(String nif);
}
