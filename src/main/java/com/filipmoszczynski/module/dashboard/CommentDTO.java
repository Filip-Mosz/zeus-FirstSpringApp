package com.filipmoszczynski.module.dashboard;

public class CommentDTO {

    private String author;
    private String text;

    public CommentDTO(String author, String text) {
        this.author = author;
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "CommentDTO{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
