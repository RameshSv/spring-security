package com.reliance.sb.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reliance")
public class BalanceController {
    @GetMapping(value = "/balance-details")
    public String fetchBalanceDetails(){
        return "Here is your balance details..!";
    }
}
