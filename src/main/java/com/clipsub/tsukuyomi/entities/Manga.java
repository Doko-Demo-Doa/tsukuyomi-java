package com.clipsub.tsukuyomi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "manga")
public class Manga {

    @Id
    private Long id;

    @Column(name = "name", length = 64, nullable = false)
    private String name;

    @Column(name = "description", length = 128, nullable = false)
    private String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
