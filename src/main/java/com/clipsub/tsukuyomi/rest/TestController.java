package com.clipsub.tsukuyomi.rest;

import com.clipsub.tsukuyomi.entities.Manga;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

    @GetMapping("/test")
    public Manga testManga(@RequestParam(name = "name", required = false) String name) {
        Manga m = new Manga();
        m.setName("AAA");
        m.setDescription("effds");
        return m;
    }
}
