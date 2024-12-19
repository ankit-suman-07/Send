package com.example.send.auth.adapter;

import com.example.send.auth.domain.AuthDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class AuthController {

    @PostMapping("/get-message")
    public ResponseEntity<String> getMessage(@RequestBody AuthDto authDto) {
        String username = authDto.getUsername();
        String responseMessage = "Hello, " + username + "! Welcome to Spring Boot 3.";
        return ResponseEntity.ok(responseMessage);
    }

    @PostMapping("/auth-signup")
    public String signup() {
        return "Login";
    }

    @PostMapping("/auth-signout")
    public String signout() {
        return "Login";
    }

    @PostMapping("/auth-login")
    public String login() {
        return "Login";
    }

    @PostMapping("/auth-logout")
    public String logout() {
        return "Login";
    }
}
