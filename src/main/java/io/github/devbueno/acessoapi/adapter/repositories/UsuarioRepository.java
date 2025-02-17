package io.github.devbueno.acessoapi.adapter.repositories;

import io.github.devbueno.acessoapi.adapter.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository  extends JpaRepository <UsuarioEntity, Long>{
    UsuarioEntity findByEmail(String email);
}
