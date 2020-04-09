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

    @PostMapping("/api/v1/words")
    public Long save(@RequestBody WordsSaveRequestDto requestDto) {
        return wordsService.save(requestDto);
    }

    @PutMapping("/words/{id}")
    public Long update(@PathVariable Long id, @RequestBody WordsUpdateRequestDto requestDto) {
        return wordsService.update(id, requestDto);
    }

    @GetMapping("/words/{id}")
    public WordsResponseDto findById(@PathVariable Long id) {

        return wordsService.findById(id);
    }


}
