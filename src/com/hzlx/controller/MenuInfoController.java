package com.hzlx.controller;

import com.hzlx.annotation.Controller;
import com.hzlx.annotation.RequestMapping;
import com.hzlx.annotation.RequestParameter;
import com.hzlx.service.MenuInfoService;
import com.hzlx.service.impl.MenuInfoServiceImpl;
import com.hzlx.utils.BaseResult;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/api/menu")
public class MenuInfoController {
    private MenuInfoService menuInfoService=new MenuInfoServiceImpl();

    @RequestMapping("/showMenuTree")
    @RequestParameter
    public String showMenuTree(HttpServletRequest request){
//      request.getSession().setAttribute("flag","home");
        return menuInfoService.showMenu(request);
    }




    @RequestMapping("/role")
    @RequestParameter
    public String role(HttpServletRequest request){
        request.getSession().setAttribute("flag","role");
        return "pages/test";
    }

    @RequestMapping("/home")
    @RequestParameter
    public String home(HttpServletRequest request){
        request.getSession().setAttribute("flag","home");
        return "pages/test";
    }






}
