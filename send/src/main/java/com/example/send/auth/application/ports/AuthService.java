package com.example.send.auth.application.ports;

import com.example.send.auth.domain.AuthDto;
import org.springframework.stereotype.Service;

public interface AuthService {
    String authenticateUser(AuthDto authDto);
    String createUser(AuthDto authDto);
}
