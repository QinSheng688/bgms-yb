package com.hzlx.service;

import com.hzlx.entity.vo.MenuInfoVo;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface MenuInfoService {
    //根据用户id获取用户角色对应的菜单树
    //
    String showMenu(HttpServletRequest request);


}
