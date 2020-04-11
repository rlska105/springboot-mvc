package com.example.controller;


import com.example.controller.dto.WordsResponseDto;
import com.example.controller.dto.WordsSaveRequestDto;
import com.example.controller.dto.WordsUpdateRequestDto;
import com.example.service.words.WordsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class WordsApiController {

    private final WordsService wordsService;

    @PostMapping("/words")
    public Long save(@RequestBody WordsSaveRequestDto requestDto) {
        return wordsService.save(requestDto);
    }

    @PutMapping("/api/v1/words/{id}")
    public Long update(@PathVariable Long id, @RequestBody WordsUpdateRequestDto requestDto) {
        return wordsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/words/{id}")
    public WordsResponseDto findById(@PathVariable Long id) {
        return wordsService.findById(id);
    }

}
