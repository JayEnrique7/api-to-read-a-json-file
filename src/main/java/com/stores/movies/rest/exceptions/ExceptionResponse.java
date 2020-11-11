package com.stores.movies.rest.exceptions;

import lombok.Data;

@Data
public class ExceptionResponse {
    private String errorCode;
    private String errorMessage;
}
