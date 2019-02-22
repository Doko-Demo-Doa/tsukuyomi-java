package com.clipsub.tsukuyomi.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "manga")
public class Manga {

    @Id
    @GeneratedValue(generator = "manga_generator")
    @SequenceGenerator(name = "manga_generator", sequenceName = "manga_sequence", initialValue = 1000)
    private Long id;

    @Column(name = "name", length = 64, nullable = false)
    @NotBlank
    @Size(min = 3, max = 100)
    private String name;

    @Column(name = "description", length = 128, nullable = false, columnDefinition = "text")
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
