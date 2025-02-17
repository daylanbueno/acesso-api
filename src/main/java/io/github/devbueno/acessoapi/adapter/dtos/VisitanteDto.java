package io.github.devbueno.acessoapi.adapter.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class VisitanteDto {
    private Long id;
    private String nome;
    private String rg;
}
