package com.cjn.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author Sky
 * @date 2020/6/9 0009 21:50
 */
@RequestMapping("/user")
@Controller
public class UserController {

    private static String PASSWORD = "123456";

    // @RequestMapping(value = "/login", method = RequestMethod.POST)
    @PostMapping(value = "/login")
    public String login(@RequestParam("username") String userName,
                        @RequestParam("password") String password,
                        Map<String, Object> map, HttpSession session) {
        if (!StringUtils.isEmpty(userName) && PASSWORD.equals(password)) {
            // 使用重定向，防止表单重复提交
            session.setAttribute("user", userName);
            return "redirect:/main";
        }
        map.put("msg", "密码错误");
        return "login";
    }
}
