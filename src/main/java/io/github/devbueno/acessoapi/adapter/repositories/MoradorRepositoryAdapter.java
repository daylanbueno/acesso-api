package io.github.devbueno.acessoapi.adapter.repositories;

import io.github.devbueno.acessoapi.adapter.entities.MoradorEntity;
import io.github.devbueno.acessoapi.adapter.entities.PessoaEntity;
import io.github.devbueno.acessoapi.adapter.entities.UsuarioEntity;
import io.github.devbueno.acessoapi.core.domain.Morador;
import io.github.devbueno.acessoapi.core.domain.Pessoa;
import io.github.devbueno.acessoapi.core.domain.Usuario;
import io.github.devbueno.acessoapi.core.ports.MoradorRepositoryPort;
import io.github.devbueno.acessoapi.core.ports.UsuarioRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MoradorRepositoryAdapter implements MoradorRepositoryPort {

    private final MoradorRepository moradorRepository;
    private final PessoaRepositoryAdapter pessoaRepository;
    private final ModelMapper modelMapper;

    @Override
    public Morador create(Morador morador) {
        MoradorEntity entity = modelMapper.map(morador, MoradorEntity.class);
        entity.setPessoaEntity(pessoaRepository.createPessoa(morador.getPessoa()));
        MoradorEntity novoMorador = moradorRepository.save(entity);
        return modelMapper.map(novoMorador, Morador.class);
    }

    @Override
    public Morador obtainByCpf(String cpf) {
        MoradorEntity moradoByCpf = moradorRepository.findByCpf(cpf);
        if (moradoByCpf == null) {
            return null;
        }
        return modelMapper.map(moradoByCpf, Morador.class);
    }

}
