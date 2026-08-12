package dev.rmarcos.jobboard.domain.exceptions;

import org.springframework.validation.BindException;

public class ResourceNotFoundException extends BindException {
  public ResourceNotFoundException(Object target, String objectName, String message) {
    super(target, objectName);
    this.reject("NOT_FOUND", message);
  }
}