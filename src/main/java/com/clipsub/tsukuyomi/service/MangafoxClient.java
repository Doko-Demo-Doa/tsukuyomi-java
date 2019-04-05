package com.clipsub.tsukuyomi.service;

import com.clipsub.tsukuyomi.entity.Manga;
import lombok.extern.slf4j.Slf4j;
import org.springframework.hateoas.client.Traverson;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

// @Service
// @Slf4j
public class MangafoxClient {

    private RestTemplate rest;
    private Traverson traverson;

    public MangafoxClient(RestTemplate rest, Traverson traverson) {
        this.rest = rest;
        this.traverson = traverson;
    }

    /* public Manga getMangaById(String mangaId) {
        return rest.getForObject("http://localhost:8080/manga/{id}", Manga.class, mangaId);
    } */

    // Another variant:
    public Manga getMangaById(String mangaId) {
        Map<String, String> urlVariables = new HashMap<>();
        urlVariables.put("id", mangaId);
        return rest.getForObject("http://localhost:8080/manga/{id}", Manga.class, urlVariables);
    }
}
