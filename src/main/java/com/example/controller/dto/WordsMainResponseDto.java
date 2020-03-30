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
        id = entity.getId();
        word = entity.getWord();
        meaning = entity.getMeaning();
        modifiedDate = toStringDateTime(entity.getModifiedDate());
    }

    private String toStringDateTime(LocalDateTime localDateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return Optional.ofNullable(localDateTime)
                .map(formatter::format)
                .orElse("");
    }
}
