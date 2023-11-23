package com.springboot.heallage.data.entity;

import com.springboot.heallage.data.dto.post.PostRequestDto;
import jakarta.persistence.*;
import lombok.Builder;
import org.hibernate.annotations.ColumnDefault;

import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
public class Post extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "postId")
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne(optional = false)
    @JoinColumn(name = "categoryId")
    private Category category;

    @ManyToOne(optional = false)
    @JoinColumn(name = "bookmarkStorageId")
    private BookmarkStorage bookmarkStorage;

    @OneToMany(mappedBy = "post")
    private List<PostImage> postImages = new ArrayList<>();

    @OneToMany(mappedBy = "post")
    private List<Reaction> reactions = new ArrayList<>();

    @OneToMany(mappedBy = "post")
    private List<Tagging> tags = new ArrayList<>();

    @Column(nullable = false, length = 50)
    private String title;

    private String content;

    @Column(nullable = false, columnDefinition = "tinyint(1) default 0")
    private boolean isDeleted;

    @ColumnDefault("0")
    @Column(nullable = false)
    private Integer views;

    @ColumnDefault("0")
    @Column(nullable = false)
    private Integer bookmarkCount;

    @ColumnDefault("0")
    @Column(nullable = false)
    private Integer reactionCount;
}
