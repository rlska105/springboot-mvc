package com.example.service.words;


import com.example.controller.dto.WordsSaveRequestDto;
import com.example.domain.words.WordRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@AllArgsConstructor
@Service
public class WordsService {

    private WordRepository wordRepository;

    @Transactional
    public Long save(WordsSaveRequestDto dto) {
        return wordRepository.save(dto.toEntity()).getId();
    }

}
