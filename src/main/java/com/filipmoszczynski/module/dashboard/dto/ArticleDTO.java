package com.filipmoszczynski.module.dashboard.dto;

import java.util.List;

public class ArticleDTO {

    private  String title;
    private String text;
    private List<CommentDTO> comments;

    public String getTitle() {
        return title;
    }

    public ArticleDTO setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getText() {
        return text;
    }

    public ArticleDTO setText(String text) {
        this.text = text;
        return this;
    }

    public List<CommentDTO> getComments() {
        return comments;
    }

    public ArticleDTO setComments(List<CommentDTO> comments) {
        this.comments = comments;
        return this;
    }

    @Override
    public String toString() {
        return "ArticleDTO{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", comments=" + comments +
                '}';
    }
}
