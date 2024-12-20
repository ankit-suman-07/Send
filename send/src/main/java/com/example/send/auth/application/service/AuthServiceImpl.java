package com.example.send.auth.application.service;

import com.example.send.auth.application.ports.AuthService;
import com.example.send.auth.domain.AuthDto;

public class AuthServiceImpl implements AuthService {

    @Override
    public String authenticateUser(AuthDto authDto) {
        if(authDto.getUsername() != null && authDto.getPassword() != null) {
            return "User: " + authDto.getUsername() + " | Password: " + authDto.getPassword();
        }
        return "No User Found";
    }
}
