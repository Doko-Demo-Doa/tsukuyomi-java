package com.clipsub.tsukuyomi.entity;

import javax.persistence.*;

@Entity
@Table(name = "manga")
public class Manga {
    public Manga() {
    }

    public Manga(String name) {
        this.name = name;
    }

    public Manga(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
