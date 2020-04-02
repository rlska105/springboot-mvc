package com.example.controller.dto;


import com.example.domain.words.Words;
import lombok.Getter;

@Getter
public class WordsResponseDto {

    private Long id;
    private String word;
    private String meaning;

    public WordsResponseDto(Words entity) {
        this.id = entity.getId();
        this.word = entity.getWord();
        this.meaning = entity.getMeaning();
    }
}
