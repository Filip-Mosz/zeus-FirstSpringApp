package com.filipmoszczynski.module.dashboard.service;

import com.filipmoszczynski.module.dashboard.dto.MenuDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    public List<MenuDTO> getMenu() {
        return List.of(
                new MenuDTO("AWS", "http://michalszalkowski.com/aws/")   ,
                new MenuDTO("Security", "http://michalszalkowski.com/security/")   ,
                new MenuDTO("Java", "http://michalszalkowski.com/java/")
        );
    }
}
