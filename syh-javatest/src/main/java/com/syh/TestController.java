package com.syh;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {
    @RequestMapping(value = "hello")
    public String hello(){
        return "hello";
    }
}