package com.springboot.heallage.domain.exception;

import com.springboot.heallage.domain.response.ExceptionResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ExceptionResponse> handleCustomException(CustomException e) {
        return ExceptionResponse.toResponseEntity(e.getExceptionCode());
    }
}
