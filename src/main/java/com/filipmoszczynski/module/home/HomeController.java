package com.filipmoszczynski.module.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getHome(Model model) {
        PersonDTO person = new PersonDTO(
                "Hans",
                "Talhoffer",
                31
        );
        PersonDTO person2 = new PersonDTO(
                "Johannes",
                "Lichtenauer",
                32
        );
        PersonDTO person3 = new PersonDTO(
                "Fiore",
                "de Liberi",
                33
        );

        List<PersonDTO> personsList = List.of(person,person2,person3);

        model.addAttribute("name", "Filip");
        model.addAttribute("person", person);
        model.addAttribute("personsList", personsList);
        return "home";
    }
}
