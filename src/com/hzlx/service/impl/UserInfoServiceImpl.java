package com.hzlx.service.impl;

import com.hzlx.component.BgmsConfig;
import com.hzlx.dao.UserInfoDao;
import com.hzlx.dao.impl.UserInfoDaoImpl;
import com.hzlx.entity.UserInfo;
import com.hzlx.service.UserInfoService;
import com.hzlx.utils.BaseResult;
import com.hzlx.utils.MD5Utils;
import com.mysql.cj.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserInfoServiceImpl implements UserInfoService {
    UserInfoDao userInfoDao=new UserInfoDaoImpl();
    @Override
    public String login(HttpServletRequest request) {
        //从请求中获取用户名和密码
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        //非空校验
        if (StringUtils.isNullOrEmpty(userName)||StringUtils.isNullOrEmpty(password)){
            return BaseResult.error(10001,"用户名和密码不能为空");
        }
        //给密码加密
        String encryptPwd = MD5Utils.encryptMD5(password, userName);
        //拿加密后的密码和名去数据库查
        UserInfo userInfo = userInfoDao.getUserInfoByUserNameAndPassword(userName, encryptPwd);

        if (userInfo==null){
            return BaseResult.error(10002,"账号或密码错误");
        }
        System.out.println("账号密码正确");
        //登录成功后把信息存到session作用域中，后续使用
        request.getSession().setAttribute(BgmsConfig.SESSION_USER_KEY,userInfo);
        return BaseResult.success();
    }
}
