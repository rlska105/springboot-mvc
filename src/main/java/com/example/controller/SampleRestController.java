package com.example.controller;


import com.example.controller.dto.WordsSaveRequestDto;
import com.example.domain.words.WordRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class SampleRestController {

    private WordRepository wordRepository;

    @GetMapping("/hello")
    public String hello(){
        return "HelloHello!";
    }

    @PostMapping("/words")
    public void saveWords(@RequestBody WordsSaveRequestDto dto){
        wordRepository.save(dto.toEntity());
    }

}
