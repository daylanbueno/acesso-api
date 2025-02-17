package io.github.devbueno.acessoapi.adapter.repositories;

import io.github.devbueno.acessoapi.adapter.entities.MoradorEntity;
import io.github.devbueno.acessoapi.adapter.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoradorRepository extends JpaRepository <MoradorEntity, Long>{
    MoradorEntity findByCpf(String cpf);
}
