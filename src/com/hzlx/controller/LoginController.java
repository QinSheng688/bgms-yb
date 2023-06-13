package com.hzlx.controller;

import com.hzlx.service.UserInfoService;
import com.hzlx.service.impl.UserInfoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("/login.do")
//public class LoginController extends HttpServlet {
//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        UserInfoService userInfoService=new UserInfoServiceImpl();
//        resp.setContentType("text/html;charset=UTF-8");
//       resp.getWriter().write(userInfoService.login(req, resp));
//    }
//}
