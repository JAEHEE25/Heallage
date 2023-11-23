package com.springboot.heallage.data.entity;

import jakarta.persistence.*;

@Entity
public class Follow extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "followId")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "following", insertable = false, updatable = false)
    private User following;

    @ManyToOne
    @JoinColumn(name = "follower", insertable = false, updatable = false)
    private User follower;

    @Column(nullable = false, columnDefinition = "tinyint(1) default 0")
    private boolean status;
}
