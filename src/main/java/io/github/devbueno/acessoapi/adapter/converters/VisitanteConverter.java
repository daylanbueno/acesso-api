package io.github.devbueno.acessoapi.adapter.converters;

import io.github.devbueno.acessoapi.adapter.dtos.MoradorDto;
import io.github.devbueno.acessoapi.adapter.dtos.VisitanteDto;
import io.github.devbueno.acessoapi.core.domain.Morador;
import io.github.devbueno.acessoapi.core.domain.Pessoa;
import io.github.devbueno.acessoapi.core.domain.Visitante;
import org.springframework.stereotype.Component;

@Component
public class VisitanteConverter {

    public Visitante toTomain(VisitanteDto visitanteDto) {
        return new Visitante(visitanteDto.getId(), visitanteDto.getRg(),
                new Pessoa(null, visitanteDto.getNome())
        );
    }

    public VisitanteDto toDto (Visitante visitante) {
        return new VisitanteDto(visitante.getId(),visitante.getPessoa().getNome(), visitante.getRg());
    }
}
