package com.wuhu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping("tt")
    public String tt(){
        return "hello,";
    }
}
