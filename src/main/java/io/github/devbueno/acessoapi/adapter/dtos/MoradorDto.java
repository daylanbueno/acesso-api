package io.github.devbueno.acessoapi.adapter.dtos;

import io.github.devbueno.acessoapi.core.domain.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MoradorDto {
    private Long id;
    private String nome;
    private String cpf;
    private String endereco;
    private String celular;
}
