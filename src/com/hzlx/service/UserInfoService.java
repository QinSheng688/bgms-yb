package com.hzlx.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface UserInfoService {
    //用户登录的方法
    //放回json字符串
    String login(HttpServletRequest request);
}
