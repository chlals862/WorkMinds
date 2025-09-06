package com.workminds.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World from WorkMinds! 🚀";
    }

    @GetMapping("/")
    public String home() {
        return "WorkMinds Backend is running!";
    }
}