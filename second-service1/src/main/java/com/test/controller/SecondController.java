package com.test.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consumer")
public class SecondController {

    @GetMapping("/message")
    public String test(){
        return "Hello CGI Called in Second Service";
    }

}
