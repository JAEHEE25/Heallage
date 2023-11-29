package com.springboot.heallage.domain.exception;

import com.springboot.heallage.domain.constants.ExceptionCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CustomException extends RuntimeException {
    private ExceptionCode exceptionCode;
}
