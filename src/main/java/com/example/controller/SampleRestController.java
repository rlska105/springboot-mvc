package com.example.controller;


import com.example.controller.dto.WordsSaveRequestDto;
import com.example.domain.words.WordRepository;
import com.example.service.words.WordsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class SampleRestController {

    private WordsService wordsService;

    @GetMapping("/hello")
    public String hello() {
        return "HelloHello!";
    }

    @PostMapping("/words")
    public Long saveWords(@RequestBody WordsSaveRequestDto dto) {
        return wordsService.save(dto);
    }

}
