package com.example.controller;


import com.example.controller.dto.WordsSaveRequestDto;
import com.example.service.words.WordsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class WordsApiController {

    private final WordsService wordsService;

    @PostMapping("/words")
    public Long save(@RequestBody WordsSaveRequestDto requestDto){
        return wordsService.save(requestDto);
    }


}
