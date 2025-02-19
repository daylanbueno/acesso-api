package io.github.devbueno.acessoapi.infra.handlers;

import io.github.devbueno.acessoapi.core.exceptions.BusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationResourceAdvice {

  @ExceptionHandler(BusinessException.class)
  @ResponseStatus(HttpStatus.PRECONDITION_FAILED)
  public ApiError handleBusinessException(BusinessException ex) {
    return new ApiError(ex.getMessage());
  }
}
