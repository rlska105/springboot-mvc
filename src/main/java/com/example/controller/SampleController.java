package com.example.controller;


import com.example.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    private SampleService sampleService;


    @GetMapping("/sample")
    public String sample(){
        return "sample " + sampleService.getName();
    }
}