package io.github.devbueno.acessoapi.core.ports;

import io.github.devbueno.acessoapi.core.domain.Morador;
import java.util.Collection;

public interface MoradorServicePort {
    Morador createMorador(Morador morador);
    Collection<Morador> findAll();
}
