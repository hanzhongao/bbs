package com.hza.bbs.biz;

import com.hza.bbs.vo.User;

/**
 * Create by hza
 * 2019-11-12 11:31
 */
public interface SelfBiz {

    boolean register(String username, String email, String password1, String password2) ;
    User login(String username, String password) ;

}
