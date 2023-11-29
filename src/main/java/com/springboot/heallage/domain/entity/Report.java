package com.springboot.heallage.domain.entity;

import jakarta.persistence.*;

@Entity
public class Report extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reportId")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "reporter", insertable = false, updatable = false)
    private User reporter;

    @ManyToOne
    @JoinColumn(name = "reportedUser", insertable = false, updatable = false)
    private User reportedUser;
}
