package com.yhyxzh.pms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String home() {
        return "home"; // 返回首页视图
    }

    @GetMapping("/login")
    public String login() {
        return "login"; // 返回登录页面视图
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin"; // 返回管理页面视图
    }
}
