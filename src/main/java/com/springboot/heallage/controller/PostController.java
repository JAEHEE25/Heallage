package com.springboot.heallage.controller;

import com.springboot.heallage.data.constants.ResponseMessage;
import com.springboot.heallage.data.dto.BaseResponse;
import com.springboot.heallage.data.dto.post.PostRequestDto;
import com.springboot.heallage.sevice.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/post")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @PostMapping
    public ResponseEntity<BaseResponse> createPost(PostRequestDto postRequestDto) {
        Long responseBody = postService.savePost(postRequestDto);
        BaseResponse response = BaseResponse.buildResponse(ResponseMessage.POST_SAVE.getMessage(), responseBody);
        return ResponseEntity.status(ResponseMessage.POST_SAVE.getCode()).body(response);
    }
}
