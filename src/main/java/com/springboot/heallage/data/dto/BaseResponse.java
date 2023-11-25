package com.springboot.heallage.data.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BaseResponse {
    private String message;
    private Object data;

    public static BaseResponse of(String message, Object data) {
        return BaseResponse.builder()
                .message(message)
                .data(data)
                .build();
    }
}
