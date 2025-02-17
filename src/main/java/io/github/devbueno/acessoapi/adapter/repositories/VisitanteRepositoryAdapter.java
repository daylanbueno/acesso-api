package io.github.devbueno.acessoapi.adapter.repositories;

import io.github.devbueno.acessoapi.adapter.entities.VisitanteEntity;
import io.github.devbueno.acessoapi.core.domain.Visitante;
import io.github.devbueno.acessoapi.core.ports.VisitanteRepositoryPort;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class VisitanteRepositoryAdapter implements VisitanteRepositoryPort {

    private final VisitanteRepository visitanteRepository;
    private final PessoaRepositoryAdapter pessoaRepository;
    private final ModelMapper modelMapper;

    @Override
    public Visitante create(Visitante visitante) {
        VisitanteEntity entity = modelMapper.map(visitante, VisitanteEntity.class);
        entity.setPessoaEntity(pessoaRepository.createPessoa(visitante.getPessoa()));
        return modelMapper.map(visitanteRepository.save(entity), Visitante.class);
    }

    @Override
    public Visitante obtainByRg(String rg) {
        VisitanteEntity visitanteEntity = visitanteRepository.findByRg(rg);
        if (visitanteEntity == null) {
            return null;
        }
        return modelMapper.map(visitanteEntity, Visitante.class);
    }
}
