package com.clipsub.tsukuyomi.repositories;

import com.clipsub.tsukuyomi.entities.Manga;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MangaRepository extends JpaRepository<Manga, Long> {
    Manga findBy(Long id);

    List<Manga> findByNameLike(String name);
}
