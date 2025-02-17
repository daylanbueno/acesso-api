package io.github.devbueno.acessoapi.core.ports;

import io.github.devbueno.acessoapi.core.domain.Usuario;

public interface UsuarioServicePort {

    Usuario createUsuario(Usuario usuario);
}
