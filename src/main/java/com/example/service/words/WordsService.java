package com.example.service.words;


import com.example.controller.dto.WordsResponseDto;
import com.example.controller.dto.WordsSaveRequestDto;
import com.example.controller.dto.WordsUpdateRequestDto;
import com.example.domain.words.Words;
import com.example.domain.words.WordsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class WordsService {

    private final WordsRepository wordsRepository;

    @Transactional
    public Long save(WordsSaveRequestDto requestDto) {
        return wordsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, WordsUpdateRequestDto requestDto) {
        Words words = wordsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));
        words.update(requestDto.getWord(), requestDto.getMeaning());
        return id;
    }

    @Transactional(readOnly = true)
    public WordsResponseDto findById(Long id) {
        Words entity = wordsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));
        return new WordsResponseDto(entity);
    }

}
