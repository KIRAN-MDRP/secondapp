package com.java.apps.secondapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello! Welcome to Second App.";
    }

    @GetMapping("/api/welcome")
    public String welcome() {
        return "Welcome! Your secondapp endpoints are working.";
    }
}
