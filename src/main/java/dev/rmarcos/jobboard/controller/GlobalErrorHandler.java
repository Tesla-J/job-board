package dev.rmarcos.jobboard.controller;

import dev.rmarcos.jobboard.domain.exceptions.ActionNotAuthorizedException;
import dev.rmarcos.jobboard.domain.exceptions.ResourceNotFoundException;
import dev.rmarcos.jobboard.domain.responses.Response;
import jakarta.el.MethodNotFoundException;

import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.ErrorResponse;
import org.springframework.web.ErrorResponseException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/*
MethodArgumentNotValidException (request body/fields fail validation with @Valid)
MissingServletRequestParameterException (missing required query/form parameter)
MissingPathVariableException (missing required path variable)
MethodArgumentTypeMismatchException (parameter/path variable can’t be converted to the target type)
HttpMessageNotReadableException (malformed JSON/XML or unreadable request body)
HttpMediaTypeNotSupportedException (unsupported Content-Type)
HttpMediaTypeNotAcceptableException (cannot produce a response for the requested Accept)
NoHandlerFoundException (no controller/endpoint mapped for the request)
NoResourceFoundException (static resource not found)
HttpRequestMethodNotSupportedException (wrong HTTP method for the endpoint)
AsyncRequestTimeoutException (async processing timed out)
BindException (data binding/validation errors during parameter binding)
ConversionNotSupportedException / ConverterNotFoundException (no suitable converter to map request value to target type)
ConstraintViolationException (JPA/Bean Validation constraint violations, commonly with javax/jakarta.validation scenarios)
 */

@RestControllerAdvice
public class GlobalErrorHandler {
    private List<String> getErrorList(BindException exception){
        return exception
                .getBindingResult()
                .getFieldErrors()
                .stream()
                .map(it -> it.getField() + ": " + it.getDefaultMessage())
                .toList();
    }

    private ResponseEntity<Response> buildErrorResponse(HttpStatus status, BindException exception, HttpServletRequest request){
        Response response = new Response(
                Instant.now(),
                status.value(),
                status.getReasonPhrase(),
                getErrorList(exception),
                request.getRequestURI()
        );
        return ResponseEntity
                .status(status.value())
                .body(response);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({MethodArgumentNotValidException.class})
    ResponseEntity<Response> handleBadRequest(MethodArgumentNotValidException exception, HttpServletRequest request){
        return buildErrorResponse(HttpStatus.BAD_REQUEST, exception, request);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    ResponseEntity<Response> handleNotFound(ResourceNotFoundException exception, HttpServletRequest request){
        return buildErrorResponse(HttpStatus.NOT_FOUND, exception, request);
    }

    @ResponseStatus(HttpStatus.FORBIDDEN)
    @ExceptionHandler(ActionNotAuthorizedException.class)
    ResponseEntity<Response> handleForbidden(ActionNotAuthorizedException exception, HttpServletRequest request){
        return buildErrorResponse(HttpStatus.FORBIDDEN, exception, request);
    }
}
