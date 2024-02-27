package com.example.hellogithubactionsdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloGithubActions {

    @GetMapping("hello")
    public String sayHello(){
        return "hello";
    }
}
