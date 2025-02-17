package io.github.devbueno.acessoapi.adapter.controllers;

import io.github.devbueno.acessoapi.adapter.converters.VisitanteConverter;
import io.github.devbueno.acessoapi.adapter.dtos.VisitanteDto;
import io.github.devbueno.acessoapi.core.domain.Visitante;
import io.github.devbueno.acessoapi.core.ports.VisitanteServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/visitantes")
@RequiredArgsConstructor
public class VisitanteController {


    private final VisitanteConverter visitanteConverter;
    private final VisitanteServicePort visitanteServicePort;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VisitanteDto create(@RequestBody VisitanteDto visitanteDto) {
        Visitante visitante = visitanteServicePort.createVisitante(visitanteConverter.toTomain(visitanteDto));
        return visitanteConverter.toDto(visitante);
    }

}
