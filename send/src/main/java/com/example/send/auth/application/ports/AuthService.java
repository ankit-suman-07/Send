package com.example.send.auth.application.ports;

import com.example.send.auth.domain.AuthDto;

public interface AuthService {
    String authenticateUser(AuthDto authDto);
}
