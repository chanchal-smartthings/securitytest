package com.smartthings.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;



@SpringBootApplication
@ComponentScan({"com.smartthings"})
@EnableResourceServer
public class SpringBootResourceApplicationConfig {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootResourceApplicationConfig.class, args);
    }
}
