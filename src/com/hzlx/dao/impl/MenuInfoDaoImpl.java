package com.hzlx.dao.impl;

import com.hzlx.dao.MenuInfoDao;
import com.hzlx.entity.MenuInfo;
import com.hzlx.utils.BaseDao;

import java.util.List;

public class MenuInfoDaoImpl extends BaseDao<MenuInfo>implements MenuInfoDao {
    @Override
    public List<MenuInfo> getMenuInfoListByPid(Integer userId,Integer pId) {
//        String sql="select * from t_menu_info where `status`=1 and p_id=?";
        String sql="select  tmi.* from t_menu_info tmi left join t_menu_role_info tmri on tmri.menu_id=tmi.id left join t_user_role_info turi on tmri.role_id = turi.role_id where turi.user_id=? and tmi.`status`=1 and tmi.p_id=?";
        return selectListForObject(sql,MenuInfo.class,userId,pId);
    }
}
