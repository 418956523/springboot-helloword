package com.laoxu.springboothelloworldquick.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello(){
        return "你好！jar包部署成功3！";
        //456
        //111
    }
}
