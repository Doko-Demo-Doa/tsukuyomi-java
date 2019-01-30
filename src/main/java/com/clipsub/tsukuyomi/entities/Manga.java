package com.clipsub.tsukuyomi.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
public class Manga {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
}
