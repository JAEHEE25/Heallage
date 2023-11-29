package com.springboot.heallage.domain.constants;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ResponseCode {
    POST_SAVE(HttpStatus.CREATED, "게시글 등록 성공!"),
    POST_GET(HttpStatus.OK, "게시글 조회 성공!"),
    POST_LIST_GET(HttpStatus.OK, "전체 게시글 조회 성공!");

    private final HttpStatus status;
    private final String message;

    ResponseCode(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }
}
