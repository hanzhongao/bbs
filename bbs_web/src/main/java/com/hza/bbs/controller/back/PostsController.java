package com.hza.bbs.controller.back;

import com.hza.bbs.biz.PostBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Create by hza
 * 2019-11-13 14:20
 */
@Controller("postsController")
@RequestMapping("/back")
public class PostsController {

    @Autowired
    private PostBiz postBiz ;

    @RequestMapping("/posts")
    public String posts(Map<String, Object> map) {
        map.put("posts", this.postBiz.getAll()) ;
        return "/back/posts" ;
    }

    @RequestMapping("/remove")
    public String remove(Integer id) {
        this.postBiz.remove(id) ;
        return "redirect:/back/posts" ;
    }
}
