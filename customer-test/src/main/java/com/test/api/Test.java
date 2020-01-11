package com.test.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "item-service",fallback = TestFallBack.class)
@Component
public interface Test {

    @RequestMapping("/test/tt")
    String tt();

}
