package com.springboot.heallage.data.dto;

import lombok.Builder;

@Builder
public class BaseResponse {
    private String message;
    private Object data;

    public static BaseResponse buildResponse(String message, Object data) {
        return BaseResponse.builder()
                .message(message)
                .data(data)
                .build();
    }
}
