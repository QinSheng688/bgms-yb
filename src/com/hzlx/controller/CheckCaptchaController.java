package com.hzlx.controller;

import com.hzlx.utils.BaseResult;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/checkcaptcha.do")
public class CheckCaptchaController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String captcha = (String) req.getSession().getAttribute("captcha");
        String code = req.getParameter("code");
        resp.setContentType("text/html;charset=UTF-8");
        if (captcha.equals(code)){
            resp.getWriter().write(BaseResult.success());
        }else {
            resp.getWriter().write(BaseResult.error(10003,"验证码错误"));
        }
    }
}
