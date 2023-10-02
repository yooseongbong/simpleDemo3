package com.example.simpledemo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class SimpleDemo3Application {

    public static void main(String[] args) {
        SpringApplication.run(SimpleDemo3Application.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value="name", defaultValue = "World") String name) {
        //return String.format("Hello %s!", name);
        return "hello";
    }
}
