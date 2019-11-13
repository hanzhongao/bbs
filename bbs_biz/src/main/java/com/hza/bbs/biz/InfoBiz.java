package com.hza.bbs.biz;

import com.hza.bbs.dao.CommentDao;
import com.hza.bbs.dao.PostDao;
import com.hza.bbs.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface InfoBiz {

    /**
     * 社区会员
     * @return
     */
    int getUserNum() ;

    /**
     * 主题数
     * @return
     */
    int getPostNum() ;

    /**
     * 回帖数
     * @return
     */
    int getCommentNum() ;

}




