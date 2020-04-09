package com.example.controller;


import com.example.service.words.WordsService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
}
