package com.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HellowController {

    @RequestMapping("/hellow")
    public String sayHellow(){
        System.out.println("hellow");
        return "index";
    }
}
