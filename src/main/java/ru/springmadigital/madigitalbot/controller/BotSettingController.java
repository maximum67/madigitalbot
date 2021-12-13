package ru.springmadigital.madigitalbot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class BotSettingController {

@GetMapping("/login")
    public String getLoginPage() {
    return "login";
    }

@GetMapping("/success")
   public String getSucceessPage() {
        return "success";
   }

}
