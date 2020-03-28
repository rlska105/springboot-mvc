package com.example.domain.words;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository <Words, Long> {
}
