package com.youtube.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestECommerceApplication {

    public static void main(String[] args) {
        SpringApplication.from(Application::main).with(TestECommerceApplication.class).run(args);
    }

}
