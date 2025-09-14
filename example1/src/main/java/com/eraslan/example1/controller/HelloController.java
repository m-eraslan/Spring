package com.eraslan.example1.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class HelloController {

    //localhost:8080/api/hello


    @GetMapping(path = "/hello")
    public String sayHello(){
        return "Hello World!";
    }

    @PostMapping("/save")
    public String save(){
        return "Data Save";
    }

    @DeleteMapping("/delete")
    public String delete(){
        return "Data delete";
    }
    @GetMapping("/get")
    public String get(){
        return "Data görüntüleniyor.";

    }
    @PutMapping("/put")
    public String put(){
        return "Data güncelleniyor.";
    }
    @PatchMapping(path = "/patch")
    public String patch(){
        return "Datanın secilen kısmı güncelleniyor.";
    }

}
