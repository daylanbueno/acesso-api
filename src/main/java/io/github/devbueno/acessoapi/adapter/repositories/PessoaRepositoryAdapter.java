package io.github.devbueno.acessoapi.adapter.repositories;

import io.github.devbueno.acessoapi.adapter.entities.PessoaEntity;
import io.github.devbueno.acessoapi.core.domain.Pessoa;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PessoaRepositoryAdapter {

    private final PessoaRepository pessoaRepository;
    private final ModelMapper modelMapper;

    public PessoaEntity createPessoa(Pessoa pessoa) {
        PessoaEntity pessoaEntity = modelMapper.map(pessoa, PessoaEntity.class);
        return pessoaRepository.save(pessoaEntity);
    }
}
