package com.techreturners.apilab1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/")
    public String home(){

        return "Welcome to Drinks API!";
    }


}
