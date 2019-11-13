package com.hza.bbs.biz.impl;

import com.hza.bbs.biz.InfoBiz;
import com.hza.bbs.dao.CommentDao;
import com.hza.bbs.dao.PostDao;
import com.hza.bbs.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create by hza
 * 2019-11-13 10:20
 */
@Service("infoBiz")
public class InfoBizImpl implements InfoBiz {

    @Autowired
    private UserDao userDao ;

    @Autowired
    private PostDao postDao ;

    @Autowired
    private CommentDao commentDao ;

    @Override
    public int getUserNum() {
        return this.userDao.count() ;
    }

    @Override
    public int getPostNum() {
        return this.postDao.count();
    }

    @Override
    public int getCommentNum() {
        return this.commentDao.count();
    }

}
