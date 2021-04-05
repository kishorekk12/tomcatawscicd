package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/start")
@RestController
public class StartController {
    public String start(){
        return "AWS Sample codepipeline";
    }

}
