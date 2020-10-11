package com.filipmoszczynski.module.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getHome(Model model) {
        model.addAttribute("name", "Filip");
        return "home";
    }
}
