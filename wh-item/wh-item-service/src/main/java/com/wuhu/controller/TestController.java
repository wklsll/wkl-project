package com.wuhu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping("tt")
    public String tt() throws InterruptedException {
        Thread.sleep(5000);
        return "hello,";
    }
}
