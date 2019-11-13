package com.hza.bbs.controller.front;

import com.github.pagehelper.PageHelper;
import com.hza.bbs.biz.CommentBiz;
import com.hza.bbs.biz.InfoBiz;
import com.hza.bbs.biz.PostBiz;
import com.hza.bbs.global.Content;
import com.hza.bbs.vo.Comment;
import com.hza.bbs.vo.Post;
import com.hza.bbs.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * Create by hza
 * 2019-11-11 13:46
 */
@Controller
@RequestMapping("/front/post")
public class PostController {

    @Autowired
    private PostBiz postBiz ;

    @Autowired
    private CommentBiz commentBiz ;

    @Autowired
    private InfoBiz infoBiz ;
    /**
     * 帖子列表
     * @param map
     * @return
     */
    @RequestMapping("/list")
    public String list(Map<String, Object> map) {
        map.put("posts", this.postBiz.getAll()) ;
        map.put("userNum", this.infoBiz.getUserNum()) ;
        map.put("postNum", this.infoBiz.getPostNum()) ;
        map.put("commentNum", this.infoBiz.getCommentNum()) ;

        map.put("start",0);
        map.put("pagesize",5);


        return "front/list";
    }

    /**
     * 看指定帖子
     * @param id
     * @param map
     * @return
     */
    @RequestMapping("/getPost")
    public String post(Integer id , Map<String, Object> map) {
        map.put("post", this.postBiz.get(id)) ;
        List<Comment> comments = this.commentBiz.getByPost(id) ;
        map.put("comments", comments) ;
        map.put("count", comments.size()) ;

        map.put("userNum", this.infoBiz.getUserNum()) ;
        map.put("postNum", this.infoBiz.getPostNum()) ;
        map.put("commentNum", this.infoBiz.getCommentNum()) ;

        return "front/post";
    }

    /**
     * 去发帖
     * @param map
     * @return
     */
    @RequestMapping("/to_newPost")
    public String toNewPost(Map<String, Object> map) {
        map.put("newPost", new Post()) ;
        map.put("types", Content.getType()) ;
        map.put("tags", Content.getTags()) ;
        return "front/newpost" ;
    }

    /**
     * 发帖
     * @param session
     * @param newPost
     * @return
     */
    @RequestMapping("/newPost")
    public String newPost(HttpSession session, Post newPost) {
        User user = (User) session.getAttribute("user") ;
        newPost.setUsername(user.getUsername());
        this.postBiz.add(newPost);
        return "redirect:/front/post/list";
    }

    /**
     * 回帖
     * @param session
     * @param comment
     * @return
     */
    @RequestMapping("/comment")
    public String comment( HttpSession session, Comment comment) {
        User user = (User) session.getAttribute("user") ;
        comment.setUserId(String.valueOf(user.getId()));
        comment.setUsername(user.getUsername());
        this.commentBiz.add(comment);

        return "redirect:getPost?id=" + comment.getPostId() ;
    }

}
