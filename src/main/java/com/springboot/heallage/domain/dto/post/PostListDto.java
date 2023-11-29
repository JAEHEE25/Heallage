package com.springboot.heallage.domain.dto.post;

import com.springboot.heallage.domain.entity.*;
import jakarta.annotation.Nullable;
import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
public class PostListDto {
    private String title;
    private String content;
    private String nickname;
    private PostImage thumbnailImage;
    private List<Tagging> tags;
    private boolean isDeleted;
    private int views;
    private int bookmarkCount;
    private int reactionCount;

    public static List<PostListDto> from(List<Post> foundPosts) {
        List<PostListDto> postListDtos = new ArrayList<>();
        foundPosts.forEach(post -> postListDtos.add(toPostListDto(post)));
        return postListDtos;
    }

    private static PostListDto toPostListDto(Post foundPost) {
        return PostListDto.builder()
                .title(foundPost.getTitle())
                .content(foundPost.getContent())
                .nickname("")  //savedPost.getUser().getNickname()
                .thumbnailImage(getThumbnailImage(foundPost.getPostImages()))
                .tags(foundPost.getTags())
                .isDeleted(foundPost.isDeleted())
                .views(foundPost.getViews())
                .bookmarkCount(foundPost.getBookmarkCount())
                .reactionCount(foundPost.getReactionCount())
                .build();
    }

    private static PostImage getThumbnailImage(List<PostImage> postImages) {
        if (postImages.isEmpty()) {
            return null;
        }
        return postImages.get(0);
    }
}
