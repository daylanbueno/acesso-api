package io.github.devbueno.acessoapi.adapter.repositories;

import io.github.devbueno.acessoapi.adapter.entities.VisitanteEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitanteRepository extends JpaRepository<VisitanteEntity, Long> {
    Optional<VisitanteEntity> findByRg(String rg);
}
