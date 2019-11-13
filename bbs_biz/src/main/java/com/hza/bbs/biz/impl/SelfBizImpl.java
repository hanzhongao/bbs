package com.hza.bbs.biz.impl;

import com.hza.bbs.biz.SelfBiz;
import com.hza.bbs.dao.UserDao;
import com.hza.bbs.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create by hza
 * 2019-11-12 11:33
 */

@Service("selfBiz")
public class SelfBizImpl implements SelfBiz {

    @Autowired
    private UserDao userDao ;

    /**
     * 注册新用户
     * @param username
     * @param email
     * @param password1
     * @param password2
     * @return
     */
    @Override
    public boolean register(String username, String email, String password1, String password2) {

        if (userDao.selectByUsername(username) != null) {
            return false;
        }

        if (!password1.equals(password2)) {
            return false;
        }

        User newUser = new User() ;

        newUser.setUserStatus(0); // 设置用户状态为 0 ：正常  （用户状态: 0-正常, 1-锁定, 2-删除）
        newUser.setUsername(username);
        newUser.setEmail(email);
        newUser.setPassword(password1);
        this.userDao.insert(newUser);
        return true ;
    }

    /**
     * 用户登录
     * @param username
     * @param password
     * @return 登陆成功返回用户实例，否则返回 null
     */
    @Override
    public User login(String username, String password) {

        User user = this.userDao.selectByUsername(username);

        if (user != null && password.equals(user.getPassword())) {
            return user ;
        }

        return null;
    }
}
