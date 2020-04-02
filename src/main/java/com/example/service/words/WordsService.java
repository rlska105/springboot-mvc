package com.example.service.words;


import com.example.controller.dto.WordsMainResponseDto;
import com.example.controller.dto.WordsResponseDto;
import com.example.controller.dto.WordsSaveRequestDto;
import com.example.domain.words.WordRepository;
import com.example.domain.words.Words;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class WordsService {

    private WordRepository wordRepository;

    @Transactional
    public Long save(WordsSaveRequestDto requestDto) {
        return wordRepository.save(requestDto.toEntity()).getId();
    }

    public WordsResponseDto findById(Long id) {
        Words entity = wordRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));
        return new WordsResponseDto(entity);
    }

}
