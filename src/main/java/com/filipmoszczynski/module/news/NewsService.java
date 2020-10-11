package com.filipmoszczynski.module.news;

import org.springframework.stereotype.Service;

import java.util.List;

public interface NewsService {
    List<String> getLastNews();
}
