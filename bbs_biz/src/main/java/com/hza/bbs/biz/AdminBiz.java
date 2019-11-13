package com.hza.bbs.biz;

import com.hza.bbs.vo.User;

/**
 * Create by hza
 * 2019-11-13 13:58
 */
public interface AdminBiz {

    // 管理员后台登录
    User login(String username, String password) ;

}
