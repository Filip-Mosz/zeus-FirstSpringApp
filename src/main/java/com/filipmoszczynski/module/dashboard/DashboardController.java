package com.filipmoszczynski.module.dashboard;

import com.filipmoszczynski.module.dashboard.service.ArticleService;
import com.filipmoszczynski.module.dashboard.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardController {


    private MenuService menuService;
    private ArticleService articleService;

    @Autowired // opcjonalna; Spring wstrzyknąłby zalezności tak czy inaczej dzięki adnotacji @Service w odpowiednich klasach
    public DashboardController(MenuService menuService, ArticleService articleService) {
        this.menuService = menuService;
        this.articleService = articleService;
    }

    @RequestMapping("/dashboard")
    public String getDashboard (Model model) {

        model.addAttribute("menu", menuService.getMenu());
        model.addAttribute("article", articleService.getArticle());

        return "dashboard";
    }






}
