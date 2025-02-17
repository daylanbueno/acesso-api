package io.github.devbueno.acessoapi.core.ports;

import io.github.devbueno.acessoapi.core.domain.Usuario;

public interface UsuarioRepositoryPort {

    public Usuario create(Usuario usuario);

    public Usuario obtainByEmail(String email);
}
