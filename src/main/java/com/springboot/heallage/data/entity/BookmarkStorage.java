package com.springboot.heallage.data.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class BookmarkStorage extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookmarkStorageId")
    private Long id;

    @OneToMany(mappedBy = "bookmarkStorage")
    private List<Post> posts = new ArrayList<>();
}
