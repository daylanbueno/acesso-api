package io.github.devbueno.acessoapi.adapter.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "tb_usuario")
public class UsuarioEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String email;
    private String senha;
    private Boolean administrador;
    @OneToOne
    @JoinColumn(name = "pessoa_id")
    private PessoaEntity pessoaEntity;
}
