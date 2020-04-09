package com.example.controller.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class WordsUpdateRequestDto {

    private String word;
    private String meaning;

    public WordsUpdateRequestDto(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }

}
