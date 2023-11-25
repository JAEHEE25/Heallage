package com.springboot.heallage.data.dto.post;

import com.springboot.heallage.data.entity.*;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class PostRequestDto {
    private Category category;
    private String title;
    private String content;
    private List<PostImage> postImages;
    private List<Tagging> tags;

    public Post toEntity(PostRequestDto postRequestDto) {
        return Post.builder()
                .category(postRequestDto.getCategory())
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
