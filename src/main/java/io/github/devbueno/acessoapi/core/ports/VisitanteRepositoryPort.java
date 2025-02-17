package io.github.devbueno.acessoapi.core.ports;

import io.github.devbueno.acessoapi.core.domain.Visitante;
import java.util.Collection;
import java.util.Optional;

public interface VisitanteRepositoryPort {

    public Visitante create(Visitante visitante);

    public Optional<Visitante>  obtainByRg(String rg);

    Collection<Visitante> listAll();
}
