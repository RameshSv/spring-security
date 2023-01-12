package com.reliance.sb.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reliance")
public class CardsController {

    @GetMapping(value = "/cards-details")
    public String fetchCardsDetails(){
        return "Here is your cards details..!";
    }
}
