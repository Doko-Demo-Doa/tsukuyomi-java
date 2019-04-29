package com.clipsub.tsukuyomi.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = "genre")
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "alias", unique = true)
    private String alias;

    @Column(name = "full_name")
    private String fullName;
}
