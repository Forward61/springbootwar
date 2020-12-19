package com.freedom.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @Author freedom
 * @Description
 * @Date $ 2020/12/19 21:54
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String printHello(){
        return "Hello,现在时间是" + LocalDateTime.now();
    }
}
