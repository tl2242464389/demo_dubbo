package com.test.dubbo.service.impl;

import com.test.dubbo.mapper.DemoDubboMapper;
import com.test.dubbo.service.DemoDubboService;
import com.test.pojo.Menu;
import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:
 * @Author: tl
 * @Date: 2019-06-28 11:13
 * @Version: 1.0
 */
public class DemoDubboServiceImpl implements DemoDubboService {
    @Resource
    private DemoDubboMapper demoDubboMapper;

    @Override
    public List<Menu> selAllMenu() {
        return demoDubboMapper.selAllMenu();
    }

    @Override
    public Menu selMenuById(int id) {
        return demoDubboMapper.selMenuById(id);
    }

    @Override
    public int updMenu(Menu menu) {
        return demoDubboMapper.updMenu(menu);
    }
}
