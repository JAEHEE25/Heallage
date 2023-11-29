package com.springboot.heallage.sevice;

import com.springboot.heallage.domain.constants.ExceptionCode;
import com.springboot.heallage.domain.dto.post.PostRequestDto;
import com.springboot.heallage.domain.dto.post.PostResponseDto;
import com.springboot.heallage.domain.entity.Post;
import com.springboot.heallage.domain.exception.CustomException;
import com.springboot.heallage.domain.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public Long savePost(PostRequestDto postRequestDto) {
        Post newPost = postRequestDto.toEntity(postRequestDto);
        Post savedPost = postRepository.save(newPost);
        return savedPost.getId();
    }

    public PostResponseDto getPost(Long id) {
        Post foundPost = postRepository.findById(id).orElseThrow(
                () -> new CustomException(ExceptionCode.POST_NOT_FOUND)
        );
        return PostResponseDto.from(foundPost);
    }
}
