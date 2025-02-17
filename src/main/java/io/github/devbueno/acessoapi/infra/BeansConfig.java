package io.github.devbueno.acessoapi.infra;

import io.github.devbueno.acessoapi.core.ports.*;
import io.github.devbueno.acessoapi.core.services.MoradorService;
import io.github.devbueno.acessoapi.core.services.UsuarioService;
import io.github.devbueno.acessoapi.core.services.VisitanteService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public UsuarioServicePort usuarioServiceImpl(UsuarioRepositoryPort usuarioRepositoryPort) {
        return new UsuarioService(usuarioRepositoryPort);
    }

    @Bean
    public MoradorServicePort moradorServicePort(MoradorRepositoryPort moradorRepositoryPort) {
        return new MoradorService(moradorRepositoryPort);
    }

    @Bean
    public VisitanteServicePort visitanteServicePort(VisitanteRepositoryPort visitanteRepositoryPort) {
        return new VisitanteService(visitanteRepositoryPort);
    }
}
