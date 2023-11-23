package com.springboot.heallage.data.dto.post;

import com.springboot.heallage.data.entity.Post;
import com.springboot.heallage.data.entity.PostImage;
import com.springboot.heallage.data.entity.Tagging;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class PostRequestDto {
    private String title;
    private String content;
    private List<PostImage> postImages;
    private List<Tagging> tags;

    public Post toEntity(PostRequestDto postRequestDto) {
        return Post.builder()
                .title(postRequestDto.getTitle())
                .content(postRequestDto.getContent())
                .postImages(postRequestDto.getPostImages())
                .tags(postRequestDto.getTags())
                .build();
    }
}
