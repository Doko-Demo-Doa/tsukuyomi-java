package com.clipsub.tsukuyomi.repositories;

import com.clipsub.tsukuyomi.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    // Question findById(Long questionId);
}
