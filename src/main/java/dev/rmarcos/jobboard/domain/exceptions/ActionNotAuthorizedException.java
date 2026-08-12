package dev.rmarcos.jobboard.domain.exceptions;

import org.springframework.validation.BindException;

public class ActionNotAuthorizedException extends BindException {
    public ActionNotAuthorizedException(Object target, String objectName, String message) {
        super(target, objectName);
        this.reject("NOT_FOUND", message);
    }
}
