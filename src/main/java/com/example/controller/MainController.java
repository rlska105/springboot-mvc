package com.example.controller;


import com.example.service.words.WordsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class MainController {

    private WordsService wordsService;

    @GetMapping("/")
    public String main(Model model) {
        return "main";
    }
}
