package com.example.controller.dto;


import com.example.domain.words.Words;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class WordsSaveRequestDto {

    private String word;
    private String meaning;

    @Builder
    public WordsSaveRequestDto(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }


    public Words toEntity(){
        return Words.builder()
                .word(word)
                .meaning(meaning)
                .build();
    }
}
