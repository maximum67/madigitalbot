package ru.springmadigital.madigitalbot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.springmadigital.madigitalbot.model.BotSetting;

@Controller
@RequestMapping("/")
public class SettingController {

   @GetMapping("/setting/home")
   public String getHomePage(Model model) {
        model.addAttribute("title", "Главная страница");
   return "home";
    }

    @GetMapping("/setting/features")
    public String getFeaturesPage(Model model) {
        model.addAttribute("title", "Функции");
        return "features";
    }
    @GetMapping("/setting/contacts")
    public String getContactsPage(Model model) {
        model.addAttribute("title", "Контакты");
        return "contacts";
    }

}
