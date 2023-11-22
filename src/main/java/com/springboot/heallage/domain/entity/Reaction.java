package com.springboot.heallage.domain.entity;

import jakarta.persistence.*;

@Entity
public class Reaction extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reactionId")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "postId")
    private Post post;

    @Column(name = "reactionName", nullable = false, length = 15)
    private String name;
}
