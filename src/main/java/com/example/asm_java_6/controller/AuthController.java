package com.example.asm_java_6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthController {
    @RequestMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("message", "Vui lòng đăng nhập");
        return "security/login";
    }

    @RequestMapping("/login/success")
    public String loginSuccess(Model model) {
        model.addAttribute("message", "Đăng nhập thành công");
        return "redirect:/product/list";
    }

    @RequestMapping("/login/error")
    public String loginError(Model model) {
        model.addAttribute("message", "Sai thông tin đăng nhập");
        return "security/login";
    }

    @RequestMapping("/unauthoried")
    public String unauthoried(Model model) {
        model.addAttribute("message", "Không có quyền truy cập");
        return "security/login";
    }

    @RequestMapping("/logout/success")
    public String logoffSuccess(Model model) {
        model.addAttribute("message", "Bạn đã đăng xuất");
        return "security/login";
    }
}
