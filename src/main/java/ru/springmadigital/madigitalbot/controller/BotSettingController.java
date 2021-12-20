package ru.springmadigital.madigitalbot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class BotSettingController {

@GetMapping("/login")
    public String getLoginPage(Model model) {
    model.addAttribute("title", "Авторизация");
    return "login";
    }

@GetMapping("/success")
   public String getSucceessPage(Model model) {
    model.addAttribute("title","success");
    return "success";
   }


}
