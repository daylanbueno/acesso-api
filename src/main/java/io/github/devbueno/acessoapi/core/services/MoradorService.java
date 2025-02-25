package io.github.devbueno.acessoapi.core.services;

import io.github.devbueno.acessoapi.core.domain.Morador;
import io.github.devbueno.acessoapi.core.ports.MoradorRepositoryPort;
import io.github.devbueno.acessoapi.core.ports.MoradorServicePort;
import java.util.Collection;

public class MoradorService implements MoradorServicePort {

    private final MoradorRepositoryPort moradorRepositoryPort;

    public MoradorService(MoradorRepositoryPort moradorRepositoryPort) {
        this.moradorRepositoryPort = moradorRepositoryPort;
    }

    @Override
    public Morador createMorador(Morador morador) {
        Morador moradorExistente = moradorRepositoryPort.obtainByCpf(morador.getCpf());
        if (moradorExistente != null) {
            throw  new IllegalArgumentException("Morador já existe");
        }
        return moradorRepositoryPort.create(morador);
    }

    @Override
    public Collection<Morador> findAll() {
        return moradorRepositoryPort.findAll();
    }
}
