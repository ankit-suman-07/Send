package com.example.send.auth.adapter;

import com.example.send.auth.application.ports.AuthService;
import com.example.send.auth.domain.AuthDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class AuthController {


    AuthService authService;


    @PostMapping("/auth-login")
    public ResponseEntity<String> getMessage(@RequestBody AuthDto authDto) {
          return ResponseEntity.ok(authService.authenticateUser(authDto));
    }

    @PostMapping("/auth-signup")
    public String signup() {
        return "Login";
    }

    @PostMapping("/auth-signout")
    public String signout() {
        return "Login";
    }

    @PostMapping("/auth-logout")
    public String logout() {
        return "Login";
    }
}
