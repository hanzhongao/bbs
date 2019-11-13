package com.hza.bbs.controller.front;

import com.hza.bbs.biz.SelfBiz;
import com.hza.bbs.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Create by hza
 * 2019-11-12 11:41
 */
@Controller("selfController")
public class SelfController {

    @Autowired
    private SelfBiz selfBiz ;

    /**
     * 去注册页面
     * @return
     */
    @RequestMapping("/to_reg")
    public String toReg() {
        return "/front/register" ;
    }

    /**
     * 注册
     * @param username
     * @param email
     * @param password1
     * @param password2
     * @return
     */
    @RequestMapping("/register")
    public String register(String username, String email, String password1, String password2) {

        if (username == null || email == null || password1 == null || password2 == null) {
            return "redirect:to_reg" ;
        }

        // 如果注册成功跳转到登录页面
        if (this.selfBiz.register(username,email,password1,password2)) {
            return "redirect:to_login" ;
        }

        // 注册失败跳转到注册页面
        return "redirect:to_reg" ;
    }

    /**
     * 去登陆
     * @return
     */
    @RequestMapping("/to_login")
    public String toLogin() {
        return "/front/login" ;
    }

    /**
     * 登录
     * @param session
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/login")
    public String login(HttpSession session, String username, String password) {

        User user = this.selfBiz.login(username, password);

        if (user != null) {
            session.setAttribute("user", user);
            return "redirect:/front/post/list" ;
        }

        return "redirect:/to_login" ;
    }

    /**
     * 用户注销
     * @param session
     * @return
     */
    @RequestMapping("/quit")
    public String quit(HttpSession session) {
        session.removeAttribute("user");
        return "redirect:/front/post/list";
    }


}
