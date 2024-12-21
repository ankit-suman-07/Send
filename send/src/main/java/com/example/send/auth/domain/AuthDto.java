package com.example.send.auth.domain;

import lombok.Data;

@Data
public class AuthDto {
    private String email;
    private String username;
    private String password;
}
