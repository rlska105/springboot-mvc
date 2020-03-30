package com.example.controller;


import com.example.service.words.WordsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class WebController {

    private WordsService wordsService;

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("words", wordsService.findAllDesc());
        return "main";
    }
}
