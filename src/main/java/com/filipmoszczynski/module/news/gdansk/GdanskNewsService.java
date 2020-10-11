package com.filipmoszczynski.module.news.gdansk;

import com.filipmoszczynski.module.news.NewsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GdanskNewsService implements NewsService {

    @Override
    public List<String> getLastNews(){
        return List.of(
                "1 - News from Gdańsk",
                "2 - News from Gdańsk..."
        );
    }
}
