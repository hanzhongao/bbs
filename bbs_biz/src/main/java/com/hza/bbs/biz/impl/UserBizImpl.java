package com.hza.bbs.biz.impl;

import com.hza.bbs.biz.UserBiz;
import com.hza.bbs.dao.UserDao;
import com.hza.bbs.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by hza
 * 2019-11-13 15:14
 */
@Service("userBiz")
public class UserBizImpl implements UserBiz {

    @Autowired
    private UserDao userDao ;

    /**
     * 锁定用户
     * 用户状态 0 正常 1 锁定 2 删除
     * @param id 用户编号
     */
    @Override
    public void edit(Integer id, Integer status) {
        User user = this.userDao.select(id);
        user.setUserStatus(status);
        this.userDao.update(user);
    }

    @Override
    public List<User> getAll() {
        return this.userDao.selectAll();
    }

}
