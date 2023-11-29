package com.springboot.heallage.domain.response;

import com.springboot.heallage.domain.constants.ExceptionCode;
import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Getter
@Builder
public class ExceptionResponse {
    private int status;
    private String message;

    public static ResponseEntity<ExceptionResponse> toResponseEntity(ExceptionCode exceptionCode) {
        return ResponseEntity.status(exceptionCode.getStatus())
                .body(ExceptionResponse.builder()
                        .status(exceptionCode.getStatus().value())
                        .message(exceptionCode.getMessage())
                        .build()
                );
    }
}
