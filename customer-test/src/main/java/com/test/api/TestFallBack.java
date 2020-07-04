package com.test.api;

import org.springframework.stereotype.Component;

@Component
public class TestFallBack implements Test {
// 熔断 默认1s

    @Override
    public String tt() {
        return "系统繁忙";
    }
}
