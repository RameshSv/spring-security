package com.reliance.sb.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reliance")
public class LoanController {

    @GetMapping(value = "/loan-details")
    public String fetchLoanDetails(){
        return "Here is your loan details..!";
    }
}
