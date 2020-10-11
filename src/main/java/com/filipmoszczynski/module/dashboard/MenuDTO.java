package com.filipmoszczynski.module.dashboard;

public class MenuDTO {

    private String name;
    private String url;

    public MenuDTO(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
