package com.hza.bbs.dao;

import com.hza.bbs.vo.Comment;
import com.hza.bbs.vo.Post;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Create by hza
 * 2019-11-11 11:37
 */
@Repository
public interface CommentDao {
    void insert(Comment comment) ;
    void update(Comment comment) ;
    void delete(Integer id) ;
    List<Comment> selectByPost(Integer pid) ; // 安帖子种类查询
    List<Comment> selectByUsername(String username) ; // 安用户名查询
    int count() ; // 回帖数
}
