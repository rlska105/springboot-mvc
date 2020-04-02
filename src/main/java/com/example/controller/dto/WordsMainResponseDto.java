package com.example.controller.dto;


import com.example.domain.words.Words;
import lombok.Getter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Getter
public class WordsMainResponseDto {
    private Long id;
    private String word;
    private String meaning;
    private String modifiedDate;

    public WordsMainResponseDto(Words entity) {
        this.id = entity.getId();
        this.word = entity.getWord();
        this.meaning = entity.getMeaning();

    }
}
