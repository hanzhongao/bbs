package com.hza.bbs.controller.back;

import com.hza.bbs.biz.AdminBiz;
import com.hza.bbs.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Create by hza
 * 2019-11-13 14:08
 */
@Controller("adminController")
public class AdminController {

    @Autowired
    private AdminBiz adminBiz ;

    /**
     * 去登陆
     * @return
     */
    @RequestMapping("/to_admin_login")
    public String toAdminLogin() {
        return "/back/login" ;
    }

    /**
     * 登录
     * @param session
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/admin_login")
    public String adminLogin(HttpSession session, String username, String password) {

        User admin = this.adminBiz.login(username, password);

        if (admin != null) {
            session.setAttribute("admin", admin);
            return "redirect:/back/posts" ;
        }

        return "redirect:/to_admin_login" ;
    }

    /**
     * 用户注销
     * @param session
     * @return
     */
    @RequestMapping("/admin_quit")
    public String adminQuit(HttpSession session) {
        session.removeAttribute("admin");
        return "redirect:/to_admin_login" ;
    }

}
