package com.lunatech.springworkshop.handler;

import com.lunatech.springworkshop.exception.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    protected ResponseEntity<ApiError> handleEntityNotFound(
            EntityNotFoundException ex) {
        ApiError apiError = new ApiError(HttpStatus.NOT_FOUND, ex.getMessage());
        return new ResponseEntity<>(apiError, apiError.getStatus());
    }

}
