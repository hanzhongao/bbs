package com.hza.bbs.controller.back;

import com.hza.bbs.biz.PostBiz;
import com.hza.bbs.biz.UserBiz;
import com.hza.bbs.global.Content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Create by hza
 * 2019-11-13 14:20
 */
@Controller("usersController")
@RequestMapping("/back")
public class UsersController {

    @Autowired
    private UserBiz userBiz ;

    /**
     * 用户列表
     * @param map
     * @return
     */
    @RequestMapping("/users")
    public String users(Map<String, Object> map) {
        map.put("users", this.userBiz.getAll());
        map.put("status", Content.getStatus()) ;
        return "/back/users" ;
    }

    /**
     * 修改用户状态
     * 用户状态 0 正常 1 锁定 2 删除
     * @param id
     * @param status
     * @return
     */
    @RequestMapping("/edit")
    public String edit(Integer id, Integer status) {
        this.userBiz.edit(id, status);
        return "redirect:/back/users" ;
    }
}
