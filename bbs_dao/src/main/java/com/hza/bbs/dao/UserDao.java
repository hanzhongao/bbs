package com.hza.bbs.dao;

import com.hza.bbs.vo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Create by hza
 * 2019-11-11 11:37
 */
@Repository
public interface UserDao {

    void insert(User user) ;
    void update(User user) ;
    void delete(Integer id) ;
    User select(Integer id) ;
    List<User> selectAll() ;

    User selectByUsername(String username);

    int count() ; // 会员数
}
