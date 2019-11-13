package com.hza.bbs.biz.impl;

import com.hza.bbs.biz.PostBiz;
import com.hza.bbs.dao.CommentDao;
import com.hza.bbs.dao.PostDao;
import com.hza.bbs.vo.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Create by hza
 * 2019-11-11 13:45
 */
@Service("postBiz")
public class PostBizImpl implements PostBiz {

    @Autowired
    private PostDao postDao ;

    @Autowired
    private CommentDao commentDao ;

    @Override
    public void add(Post post) {
        post.setCreateTime(new Date());
        this.postDao.insert(post);
    }

    @Override
    public Post get(Integer id) {
        return this.postDao.select(id);
    }

    @Override
    public List<Post> getAll() {
        return this.postDao.selectAll();
    }

    @Override
    public void remove(Integer id) {
        this.postDao.delete(id);
    }
}
