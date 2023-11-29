package com.springboot.heallage.domain.dto.post;

import com.springboot.heallage.domain.entity.*;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class PostResponseDto {
    private String title;
    private String content;
    private String nickname;
    private List<PostImage> postImages;
    private List<Tagging> tags;
    private List<Reaction> reactions;
    private boolean isDeleted;
    private int views;
    private int bookmarkCount;
    private int reactionCount;

    public static PostResponseDto from(Post savedPost) {
        return PostResponseDto.builder()
                .title(savedPost.getTitle())
                .content(savedPost.getContent())
                .nickname("")  //savedPost.getUser().getNickname()
                .postImages(savedPost.getPostImages())
                .tags(savedPost.getTags())
                .reactions(savedPost.getReactions())
                .isDeleted(savedPost.isDeleted())
                .views(0)
                .bookmarkCount(0)
                .reactionCount(0)
                .build();
    }
}
