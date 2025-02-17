package io.github.devbueno.acessoapi.core.ports;

import io.github.devbueno.acessoapi.core.domain.Visitante;

public interface VisitanteServicePort {
    Visitante createVisitante(Visitante visitante);
}
