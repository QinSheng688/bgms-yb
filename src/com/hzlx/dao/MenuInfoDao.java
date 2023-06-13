package com.hzlx.dao;

import com.hzlx.entity.MenuInfo;

import java.util.List;

public interface MenuInfoDao {

    //根据pid查询父级菜单集合
    List<MenuInfo> getMenuInfoListByPid(Integer userId,Integer pId);
}
