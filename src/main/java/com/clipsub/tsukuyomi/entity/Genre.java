package com.clipsub.tsukuyomi.entity;

import javax.persistence.*;

@Entity
@Table(name = "genre")
public class Genre {

    public Genre(String alias, String fullName) {
        this.alias = alias;
        this.fullName = fullName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "alias", unique = true)
    private String alias;

    @Column(name = "full_name")
    private String fullName;

    @ManyToOne
    @JoinColumn
    private Manga manga;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
