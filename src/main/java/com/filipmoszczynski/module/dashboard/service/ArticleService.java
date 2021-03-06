package com.filipmoszczynski.module.dashboard.service;

import com.filipmoszczynski.module.dashboard.dto.ArticleDTO;
import com.filipmoszczynski.module.dashboard.dto.CommentDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    public ArticleDTO getArticle() {
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
