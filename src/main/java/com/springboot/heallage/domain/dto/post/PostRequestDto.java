package com.springboot.heallage.domain.dto.post;

import com.springboot.heallage.domain.entity.*;
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
                .isDeleted(false)
                .views(0)
                .bookmarkCount(0)
                .reactionCount(0)
                .build();
    }
}
