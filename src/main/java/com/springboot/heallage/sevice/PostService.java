package com.springboot.heallage.sevice;

import com.springboot.heallage.data.dto.post.PostRequestDto;
import com.springboot.heallage.data.entity.Post;
import com.springboot.heallage.data.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public void savePost(PostRequestDto postRequestDto) {
        Post newPost = postRequestDto.toEntity(postRequestDto);
        postRepository.save(newPost);
    }
}
