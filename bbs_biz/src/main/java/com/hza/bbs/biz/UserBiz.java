package com.hza.bbs.biz;

import com.hza.bbs.vo.User;

import java.util.List;

/**
 * Create by hza
 * 2019-11-13 15:04
 */
public interface UserBiz {

    /**
     * 用户管理操作（删除，锁定）
     * @param id
     */
    void edit(Integer id, Integer status) ;

    /**
     * 获取用户列表
     * @return
     */
    List<User> getAll() ;

}
