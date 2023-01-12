package com.reliance.sb.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {

    @GetMapping(value = "/notices")
    public String publishNotices(){
        return "Here is Reliance Bank Notices..!";
    }
}
