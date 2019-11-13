package com.hza.bbs.biz;

import com.hza.bbs.vo.Comment;
import com.hza.bbs.vo.Post;
import java.util.List;

/**
 * Create by hza
 * 2019-11-11 13:42
 */
public interface PostBiz {

    void add(Post post) ;
    Post get(Integer id) ;
    List<Post> getAll() ;

    void remove(Integer id);
}
