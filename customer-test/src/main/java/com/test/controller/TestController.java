package com.test.controller;

import com.test.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    Test test;

    @RequestMapping("s")
    public String s(@RequestParam("id") int id) {
        if (id % 2 == 0) {
            throw new RuntimeException();
        }
        return test.tt();

    }

}
