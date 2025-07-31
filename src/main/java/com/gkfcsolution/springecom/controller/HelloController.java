package com.gkfcsolution.springecom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2025 at 18:23
 * File: null.java
 * Project: SpringEcom
 *
 * @author Frank GUEKENG
 * @date 31/07/2025
 * @time 18:23
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring Ecom!";
    }
}
