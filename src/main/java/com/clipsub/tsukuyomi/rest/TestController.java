package com.clipsub.tsukuyomi.rest;

import com.clipsub.tsukuyomi.entities.Manga;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public Manga testManga(@RequestParam(name = "name", required = false, defaultValue = "Yes") String name) {
        Manga m = new Manga("AAAAA");
        return m;
    }
}
