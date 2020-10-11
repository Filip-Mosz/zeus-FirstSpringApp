package com.filipmoszczynski.module.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getHome(Model model) {
        PersonDTO person = new PersonDTO(
                "Filip",
                "Moszczyński",
                31
        );

        model.addAttribute("person", person);
        return "home";
    }
}
