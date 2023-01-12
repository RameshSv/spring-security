package com.reliance.sb.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reliance")
public class AccountController {

    @GetMapping(value = "/account-details")
    public String fetchAccountDetails(){
        return "Here is your account details..!";
    }
}
