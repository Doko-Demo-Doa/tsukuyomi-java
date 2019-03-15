package com.clipsub.tsukuyomi.repository;

import com.clipsub.tsukuyomi.entity.Manga;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MangaRepository extends CrudRepository<Manga, Long> {
    Manga findMangaById(Long mangaId);
}
