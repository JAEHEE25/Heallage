package com.springboot.heallage.data.entity;

import jakarta.persistence.*;

@Entity
public class Tagging extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "taggingId")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "tagId")
    private Tag tag;

    @ManyToOne
    @JoinColumn(name = "postId")
    private Post post;
}
