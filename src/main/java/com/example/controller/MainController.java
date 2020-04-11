package com.example.controller;


import com.example.controller.dto.WordsResponseDto;
import com.example.service.words.WordsService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Controller
public class MainController {

    private final WordsService wordsService;


    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("words", wordsService.findAllDesc());
        return "main";
    }

    @GetMapping("/words/update/{id}")
    public String update(@PathVariable Long id, Model model){
        WordsResponseDto dto = wordsService.findById(id);
        model.addAttribute("post", dto);
        return "words-update";
    }
}
