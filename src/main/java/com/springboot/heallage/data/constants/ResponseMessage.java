package com.springboot.heallage.data.constants;

import lombok.Getter;

@Getter
public enum ResponseMessage {
    POST_SAVE(201, "게시글 등록 성공!");

    private final int code;
    private final String message;

    ResponseMessage(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
