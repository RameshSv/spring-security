package com.sb.security.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SbSecurityController {

    @GetMapping(path = "/welcome")
    public String openWelcome(){
      return "Welcome to SpringSecurity";
    }
}
