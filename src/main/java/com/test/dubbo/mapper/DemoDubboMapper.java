package com.test.dubbo.mapper;

import com.test.pojo.Menu;

import java.util.List;

/**
 * @Description:
 * @Author: tl
 * @Date: 2019-06-28 11:05
 * @Version: 1.0
 */
public interface DemoDubboMapper {
    List<Menu> selAllMenu();

    Menu selMenuById(int id);

    int updMenu(Menu menu);
}
