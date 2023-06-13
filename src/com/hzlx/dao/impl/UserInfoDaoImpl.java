package com.hzlx.dao.impl;

import com.hzlx.dao.UserInfoDao;
import com.hzlx.entity.UserInfo;
import com.hzlx.utils.BaseDao;

public class UserInfoDaoImpl extends BaseDao<UserInfo>implements UserInfoDao {
    @Override
    public UserInfo getUserInfoByUserNameAndPassword(String userName, String password) {
        String sql="select * from t_user_info where user_name=? and `password`=?";
        return selectOne(sql,UserInfo.class,userName,password);
    }
}
