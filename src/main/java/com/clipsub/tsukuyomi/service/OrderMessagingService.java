package com.clipsub.tsukuyomi.service;

import com.clipsub.tsukuyomi.entity.Manga;

public interface OrderMessagingService {
    void sendManga(Manga m);
}
