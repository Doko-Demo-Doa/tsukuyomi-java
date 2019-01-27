package com.clipsub.tsukuyomi.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Manga {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
}
