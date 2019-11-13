package com.hza.bbs.biz;

import com.hza.bbs.dao.CommentDao;
import com.hza.bbs.vo.Comment;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Create by hza
 * 2019-11-11 19:44
 */
public interface CommentBiz {

  void add(Comment comment) ;
  void remove(Integer id) ;
  List<Comment> getByPost(Integer pid) ;
  List<Comment> getByUsername(String username) ;

}
