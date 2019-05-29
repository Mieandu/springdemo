package com.mieandu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
    @GetMapping("/hello_world")
    public String sayHelloWorld() {
        return "Hello World";
    }

}
