package com.clipsub.tsukuyomi.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

public class Manga {
    private final String message;

    public Manga(String message) {
        super();
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
