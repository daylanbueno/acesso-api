package io.github.devbueno.acessoapi.core.ports;

import io.github.devbueno.acessoapi.core.domain.Visitante;
import java.util.Optional;

public interface VisitanteRepositoryPort {

    public Visitante create(Visitante visitante);

    public Visitante obtainByRg(String rg);
}
