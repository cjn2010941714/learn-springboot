package com.cjn.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author Sky
 * @date 2020/6/6 0006 22:46
 */
@Controller
public class HelloController {

//    @RequestMapping({"/", "/login.html"})
//    public String index() {
//        return "index";
//    }


    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        map.put("hello", "你好");
        // classpath:/templates/success.thml
        return "success";
    }



}
