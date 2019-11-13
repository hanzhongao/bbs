package com.hza.bbs.biz.impl;

import com.hza.bbs.biz.AdminBiz;
import com.hza.bbs.dao.UserDao;
import com.hza.bbs.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create by hza
 * 2019-11-13 14:00
 */
@Service("adminBiz")
public class AdminBizImpl implements AdminBiz {

    @Autowired
    private UserDao userDao ;

    @Override
    public User login(String username, String password) {

        User user = this.userDao.selectByUsername(username);

        if (user != null && password.equals(user.getPassword())) {
            return user ;
        }

        return null;
    }

}
