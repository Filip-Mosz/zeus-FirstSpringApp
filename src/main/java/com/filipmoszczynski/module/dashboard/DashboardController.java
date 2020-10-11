package com.filipmoszczynski.module.dashboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardController {

    @Autowired
    private MenuService menuService;
    @Autowired
    private ArticleService articleService;

    @RequestMapping("/dashboard")
    public String getDashboard (Model model) {

        model.addAttribute("menu", menuService.getMenu());
        model.addAttribute("article", articleService.getArticle());

        return "dashboard";
    }






}
