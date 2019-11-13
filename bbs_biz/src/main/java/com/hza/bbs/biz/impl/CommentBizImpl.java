package com.hza.bbs.biz.impl;

import com.hza.bbs.biz.CommentBiz;
import com.hza.bbs.dao.CommentDao;
import com.hza.bbs.vo.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Create by hza
 * 2019-11-11 19:47
 */
@Service("commentBiz")
public class CommentBizImpl implements CommentBiz {

    @Autowired
    private CommentDao commentDao ;

    @Override
    public void add(Comment comment) {
        comment.setCreateTime(new Date());
        this.commentDao.insert(comment);
    }

    @Override
    public void remove(Integer id) {
        this.commentDao.delete(id);
    }

    @Override
    public List<Comment> getByPost(Integer pid) {
        return this.commentDao.selectByPost(pid);
    }

    @Override
    public List<Comment> getByUsername(String username) {
        return this.commentDao.selectByUsername(username);
    }
}
