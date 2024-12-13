package com.example.send.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DemoApi {
    @GetMapping("/products")
    public String displayWorking() {
        return "Working!!!!";
    }
}
