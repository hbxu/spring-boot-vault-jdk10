package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
class DemoRestController {

    @Value("${username:default}")
    String username;

    @Value("${password:default}")
    String password;

    @GetMapping("/info")
    Map<String, String> info() {
        return Map.of(username, password);
    }

}
