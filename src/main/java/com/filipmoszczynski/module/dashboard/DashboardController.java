package com.filipmoszczynski.module.dashboard;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DashboardController {
    @RequestMapping("/dashboard")
    public String getDashboard (Model model) {

        model.addAttribute("menu", getMenu());
        model.addAttribute("article", getArticle());

        return "dashboard";
    }

    private List<MenuDTO> getMenu() {
        return List.of(
          new MenuDTO("AWS", "http://michalszalkowski.com/aws/")   ,
          new MenuDTO("Security", "http://michalszalkowski.com/security/")   ,
          new MenuDTO("Java", "http://michalszalkowski.com/java/")
        );
    }

    private  ArticleDTO getArticle() {
        return new ArticleDTO()
                .setTitle("AWS Certified Cloud Practitioner (CLF - C01)")
                .setText("Lorem ipsum ...")
                .setComments(
                        List.of(
                                new CommentDTO("admin", "text1"),
                                new CommentDTO("admin", "text2"),
                                new CommentDTO("admin", "text3")
                        )
                );
    }


}
