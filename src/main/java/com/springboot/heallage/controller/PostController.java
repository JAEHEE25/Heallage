package com.springboot.heallage.controller;

import com.springboot.heallage.domain.constants.ResponseCode;
import com.springboot.heallage.domain.response.BaseResponse;
import com.springboot.heallage.domain.dto.post.PostRequestDto;
import com.springboot.heallage.domain.dto.post.PostResponseDto;
import com.springboot.heallage.sevice.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "api/v1/post")
public class PostController {
    private final PostService postService;

    @PostMapping
    public ResponseEntity<BaseResponse> createPost(PostRequestDto postRequestDto) {
        Long responseBody = postService.savePost(postRequestDto);
        BaseResponse response = BaseResponse.of(ResponseCode.POST_SAVE, responseBody);
        return ResponseEntity.ok(response);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<BaseResponse> getPost(@PathVariable(value = "id") Long id) {
        PostResponseDto responseBody = postService.getPost(id);
        BaseResponse response = BaseResponse.of(ResponseCode.POST_GET, responseBody);
        return ResponseEntity.ok(response);
    }
}
