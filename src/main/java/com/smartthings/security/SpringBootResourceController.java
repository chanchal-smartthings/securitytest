package com.smartthings.security;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SpringBootResourceController {
    @RequestMapping("/secret")
    public String testMethod() {
        return "Hello you are successfully authenticated by Auth 2.0 server..";
    }
}
