package com.example.send.auth.adapter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AuthController {

    @PostMapping("/signup")
    public String signup() {
        return "Login";
    }

    @PostMapping("/signout")
    public String signout() {
        return "Login";
    }

    @PostMapping("/login")
    public String login() {
        return "Login";
    }

    @PostMapping("/logout")
    public String logout() {
        return "Login";
    }
}
