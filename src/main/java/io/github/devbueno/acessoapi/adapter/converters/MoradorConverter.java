package io.github.devbueno.acessoapi.adapter.converters;

import io.github.devbueno.acessoapi.adapter.dtos.MoradorDto;
import io.github.devbueno.acessoapi.adapter.dtos.UsuarioDto;
import io.github.devbueno.acessoapi.core.domain.Morador;
import io.github.devbueno.acessoapi.core.domain.Pessoa;
import io.github.devbueno.acessoapi.core.domain.Usuario;
import org.springframework.stereotype.Component;

@Component
public class MoradorConverter {

    public Morador toTomain(MoradorDto moradorDto) {
        return new Morador(moradorDto.getId(),
                moradorDto.getCpf(),
                moradorDto.getEndereco(),
                moradorDto.getCelular(),
                new Pessoa(null, moradorDto.getNome())
        );
    }

    public MoradorDto toDto (Morador morador) {
        return new MoradorDto(morador.getId(),
                morador.getPessoa().getNome(),
                morador.getCpf(),
                morador.getEndereco(),
                morador.getCelular());
    }
}
