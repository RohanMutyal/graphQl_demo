package com.javafun.graphql.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class FilmActorController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello GraphQl";
    }

}
