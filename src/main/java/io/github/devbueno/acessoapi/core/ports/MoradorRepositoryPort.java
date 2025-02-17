package io.github.devbueno.acessoapi.core.ports;

import io.github.devbueno.acessoapi.core.domain.Morador;
import io.github.devbueno.acessoapi.core.domain.Usuario;

public interface MoradorRepositoryPort {

    public Morador create(Morador morador);

    public Morador obtainByCpf(String cpf);
}
