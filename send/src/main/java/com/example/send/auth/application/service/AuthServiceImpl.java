package com.example.send.auth.application.service;

import com.example.send.auth.application.ports.AuthService;
import com.example.send.auth.domain.AuthDto;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public String authenticateUser(AuthDto authDto) {
        if(authDto.getUsername() != null && authDto.getPassword() != null) {
            return "User: " + authDto.getUsername() + " | Password: " + authDto.getPassword();
        }
        return "No User Found";
    }

    @Override
    public String createUser(AuthDto authDto) {
        if(authDto.getUsername() != null && authDto.getPassword() != null && validateEmail(authDto.getEmail())) {
            return "User: " + authDto.getUsername() + " created with | Password: " + authDto.getPassword();
        }
        return "No User Found";
    }

    private Boolean validateEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false; // Invalid if email is null or empty
        }
        // Regular Expression for validating email
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        return email.matches(emailRegex); // Returns true if the email matches the regex
    }

}
