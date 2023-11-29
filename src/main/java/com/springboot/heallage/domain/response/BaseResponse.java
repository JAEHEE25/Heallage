package com.springboot.heallage.domain.response;

import com.springboot.heallage.domain.constants.ResponseCode;
import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@Builder
public class BaseResponse {
    private int status;
    private String message;
    private Object data;

    public static BaseResponse of(ResponseCode responseCode, Object data) {
        return BaseResponse.builder()
                .status(responseCode.getStatus().value())
                .message(responseCode.getMessage())
                .data(data)
                .build();
    }
}
