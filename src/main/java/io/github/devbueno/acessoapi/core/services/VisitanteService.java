package io.github.devbueno.acessoapi.core.services;

import io.github.devbueno.acessoapi.core.domain.Visitante;
import io.github.devbueno.acessoapi.core.ports.VisitanteRepositoryPort;
import io.github.devbueno.acessoapi.core.ports.VisitanteServicePort;

public class VisitanteService implements VisitanteServicePort {

    private final VisitanteRepositoryPort visitanteRepositoryPort;

    public VisitanteService(VisitanteRepositoryPort visitanteRepositoryPort) {
        this.visitanteRepositoryPort = visitanteRepositoryPort;
    }

    @Override
    public Visitante createVisitante(Visitante visitante) {

        Visitante existenteVisitante = visitanteRepositoryPort.obtainByRg(visitante.getRg());

        if (existenteVisitante != null) {
            throw new IllegalArgumentException("Visitante já existe");
        }

        return visitanteRepositoryPort.create(visitante);
    }

}
