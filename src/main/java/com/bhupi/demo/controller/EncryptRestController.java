package com.bhupi.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class EncryptRestController {

    @Value("${demo.jasypt.username}")
    private String username;

    @Value("${demo.jasypt.password}")
    private String password;

    @GetMapping("/test")
    private String testEncryption() {
        return "UserName: " + username + "  Password : " +password;
    }
}
