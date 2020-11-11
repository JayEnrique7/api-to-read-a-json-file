package com.stores.movies.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.handler.ResponseStatusExceptionHandler;

@ControllerAdvice(annotations = RestController.class)
public class ExceptionHandlingController extends ResponseStatusExceptionHandler {

    @ExceptionHandler(UnexpectedErrorException.class)
    public ResponseEntity<ExceptionResponse> unexpectedError(UnexpectedErrorException ex) {
        ExceptionResponse response = new ExceptionResponse();
        response.setErrorCode("Unexpected Error");
        response.setErrorMessage(ex.getMessage());
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
