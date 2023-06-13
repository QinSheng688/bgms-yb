package com.hzlx.dao;

import com.hzlx.entity.UserInfo;

public interface UserInfoDao {

    //根据用户名和密码查寻信息
    UserInfo getUserInfoByUserNameAndPassword(String userName,String password);
}
