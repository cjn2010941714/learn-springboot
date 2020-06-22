package com.cjn.boot01helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sky
 * @date 2020/6/3 0003 22:35
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String helloWorld() {
        return "hello world";
    }

}
