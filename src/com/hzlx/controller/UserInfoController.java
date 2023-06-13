package com.hzlx.controller;

import com.google.gson.Gson;
import com.hzlx.annotation.Controller;
import com.hzlx.annotation.RequestMapping;
import com.hzlx.annotation.RequestParameter;
import com.hzlx.annotation.ResponseBody;
import com.hzlx.service.UserInfoService;
import com.hzlx.service.impl.UserInfoServiceImpl;
import com.hzlx.utils.BaseResult;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/api/user")
public class UserInfoController {

    @RequestParameter
    @ResponseBody
    @RequestMapping("/checkcaptcha.do")
    public String checkcaptcha(HttpServletRequest req){
        String captcha = (String) req.getSession().getAttribute("captcha");
        String code = req.getParameter("code");

        if (captcha.equals(code)){
            System.out.println("验证码正确");
           return BaseResult.success();
        }else {
            return BaseResult.error(10003,"验证码错误");
        }
    }


    @ResponseBody
    @RequestParameter
    @RequestMapping("/login.do")
    public String login(HttpServletRequest request) throws IOException {
        UserInfoService userInfoService=new UserInfoServiceImpl();

       return userInfoService.login(request);


    }

    @RequestMapping("/manage")
    @RequestParameter
    public String manage(HttpServletRequest request){
        request.getSession().setAttribute("flag","manage");
        return "pages/test";
    }

    @RequestMapping("/pwd")
    @RequestParameter
    public String pwd(HttpServletRequest request){
        request.getSession().setAttribute("flag","pwd");
        return "pages/test";
    }




}
