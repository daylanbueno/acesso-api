package io.github.devbueno.acessoapi.infra.handlers;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiError {
  private  String message;
}
