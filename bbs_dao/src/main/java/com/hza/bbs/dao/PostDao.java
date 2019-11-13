package com.hza.bbs.dao;

import com.hza.bbs.vo.Post;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Create by hza
 * 2019-11-11 11:37
 */
@Repository
public interface PostDao {
    void insert(Post post) ;
    void update(Post post) ;
    void delete(Integer id) ;
    Post select(Integer id) ;
    List<Post> selectAll() ;
    List<Post> selectByCategory(String category) ; // 安帖子种类查询
    List<Post> selectByUsername(String username) ; // 安用户名查询
    int count() ; // 主题数
}
