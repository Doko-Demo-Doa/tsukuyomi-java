package com.clipsub.tsukuyomi.controller;

import com.clipsub.tsukuyomi.entity.Manga;
import com.clipsub.tsukuyomi.repository.MangaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping(path = "/manga", produces = "application/json")
public class MangaController {

    @Autowired
    private MangaRepository mangaRepository;

    @GetMapping("/")
    public List<Manga> getAllManga() {
        return (List<Manga>) mangaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Manga getMangaById(@PathVariable("id") Long id) {
        return mangaRepository.findMangaById(id);
    }
}
