package com.clipsub.tsukuyomi.repositories;

import com.clipsub.tsukuyomi.entities.Manga;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MangaRepository extends CrudRepository<Manga, Long> {
    Manga findBy(Long id);

    List<Manga> findByNameLike(String name);
}
