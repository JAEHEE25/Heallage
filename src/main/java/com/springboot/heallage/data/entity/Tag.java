package com.springboot.heallage.data.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Tag extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tagId")
    private Long id;

    @OneToMany(mappedBy = "tag")
    private List<Tagging> posts = new ArrayList<>();

    @Column(nullable = false, length = 20)
    private String name;
}
