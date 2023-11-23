package com.springboot.heallage.controller;

import com.springboot.heallage.data.dto.post.PostRequestDto;
import com.springboot.heallage.sevice.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/post")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @PostMapping
    public void createPost(PostRequestDto postRequestDto) {
        postService.savePost(postRequestDto);
    }
}
