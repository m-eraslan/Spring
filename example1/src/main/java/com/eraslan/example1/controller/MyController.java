package com.eraslan.example1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//PathVariable kullanımı
@RestController
@RequestMapping(path = "/api")
public class MyController {


    @GetMapping("/message/{message}")
    public String getMyMassage(@PathVariable String message){
        return "Your message is : " + message;
    }

    /*
    @GetMapping("/message/{m}")
    public String getMyMassage(@PathVariable{"m"} String message){
        return "Your message is : " + message;
    }
     */

//localhost:8080/api/message/my massage
}
