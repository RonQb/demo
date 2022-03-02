package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

   @RequestMapping("/test1")
    public String hello(){
        return "Hello Spring Boot";
    }


    @RequestMapping("/test2")
    public String hello2(){
       System.out.println("ddd");
       return "Hello Spring Bo";
    }
}
