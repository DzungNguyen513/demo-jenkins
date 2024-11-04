package com.example.demo_jenkins.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String SayHello() {
        return "Hello from Jenkins CI/CD!";
    }
}
