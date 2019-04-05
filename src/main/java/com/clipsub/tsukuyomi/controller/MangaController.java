package com.clipsub.tsukuyomi.controller;

import com.clipsub.tsukuyomi.entity.Manga;
import com.clipsub.tsukuyomi.repository.MangaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping(path = "/manga", produces = "application/json", consumes = "multipart/form-data")
public class MangaController {

    Logger logger = LoggerFactory.getLogger(MangaController.class);

    @Autowired
    private MangaRepository mangaRepository;

    @GetMapping("/")
    public List<Manga> getAllManga() {
        RestTemplate rest = new RestTemplate();
        String foo = "http://dummy.restapiexample.com/api/v1/employees";
        String result = rest.getForObject(foo, String.class);

        logger.info(result);
        return (List<Manga>) mangaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Manga getMangaById(@PathVariable("id") Long id) {
        return mangaRepository.findMangaById(id);
    }

    @PostMapping
    public Manga createManga(@RequestBody Manga manga) {
        return mangaRepository.save(manga);
    }

    @PostMapping(consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public Manga createManga(@RequestParam String name) {
        return mangaRepository.save(new Manga(name));
    }
}
