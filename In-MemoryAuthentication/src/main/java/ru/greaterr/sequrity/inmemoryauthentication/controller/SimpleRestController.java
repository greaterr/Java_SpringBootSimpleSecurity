package ru.greaterr.sequrity.inmemoryauthentication.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {
    @GetMapping("/private")
    public String getPrivate(Authentication authentication) {
        String userName = authentication.getName();

        return "Spring Security In-memory Authentication Example - Welcome " + userName;
    }
}
