package com.springboot.heallage.sevice;

import com.springboot.heallage.data.dto.post.PostRequestDto;
import com.springboot.heallage.data.dto.post.PostResponseDto;
import com.springboot.heallage.data.entity.Post;
import com.springboot.heallage.data.entity.User;
import com.springboot.heallage.data.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public PostResponseDto savePost(PostRequestDto postRequestDto) {
        Post newPost = postRequestDto.toEntity(postRequestDto);
        Post savedPost = postRepository.save(newPost);
        return PostResponseDto.from(savedPost);
    }
}
