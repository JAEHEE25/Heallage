package com.springboot.heallage.data.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.util.ArrayList;
import java.util.List;

@Entity
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(optional = false)
    @JoinColumn(name = "bookmarkStorageId")
    private BookmarkStorage bookmarkStorage;

    @OneToMany(mappedBy = "user")
    private List<Post> posts = new ArrayList<>();

    @OneToMany(mappedBy = "following")
    private List<Follow> followings = new ArrayList<>();

    @OneToMany(mappedBy = "follower")
    private List<Follow> followers = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Reaction> reactions = new ArrayList<>();

    @Column(nullable = false, length = 40)
    private String email;

    @Column(nullable = false)
    private String profileUrl;

    @Column(nullable = false, length = 20)
    private String nickname;

    @Column(nullable = false, columnDefinition = "tinyint(1) default 0")
    private boolean isWithdrawn;

    @ColumnDefault("0")
    @Column(nullable = false)
    private Integer reportedCount;
}
