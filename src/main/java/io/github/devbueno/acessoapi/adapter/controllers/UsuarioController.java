package io.github.devbueno.acessoapi.adapter.controllers;

import io.github.devbueno.acessoapi.adapter.converters.UsuarioConverter;
import io.github.devbueno.acessoapi.adapter.dtos.UsuarioDto;
import io.github.devbueno.acessoapi.core.ports.UsuarioServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioServicePort usuarioServicePort;
    private final UsuarioConverter usuarioConverter;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioDto create(@RequestBody UsuarioDto usuarioDto) {
        return  usuarioConverter
                .toDto(usuarioServicePort.createUsuario(usuarioConverter.toTomain(usuarioDto)));
    }
}
