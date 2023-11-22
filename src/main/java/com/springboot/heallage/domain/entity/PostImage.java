package com.springboot.heallage.domain.entity;

import jakarta.persistence.*;

@Entity
public class PostImage extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "postImageId")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "postId")
    private Post post;

    @Column(name = "postImageUrl", nullable = false)
    private String url;
}
