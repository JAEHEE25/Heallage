package com.springboot.heallage.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Post extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "postId")
    private Long id;

    @ManyToOne()  //optional == false
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne()
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

    @Column(nullable = false)
    private Integer views;

    @Column(nullable = false)
    private Integer bookmarkCount;

    @Column(nullable = false)
    private Integer reactionCount;
}
