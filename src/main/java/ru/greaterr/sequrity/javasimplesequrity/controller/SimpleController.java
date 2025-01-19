package ru.greaterr.sequrity.javasimplesequrity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {

    @GetMapping("/public")
    @ResponseBody
    public String publicHello() {
        return "Hello, Public!";
    }

    @GetMapping("/private")
    @ResponseBody
    public String privateHello() {
        return "Hello, Private!";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}