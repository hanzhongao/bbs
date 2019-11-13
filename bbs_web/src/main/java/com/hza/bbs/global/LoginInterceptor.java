package com.hza.bbs.global;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Create by hza
 * 2019-11-12 12:12
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String path = request.getRequestURI() ;

        // 登录相关功能， 放行
        if (path.toLowerCase().contains("login")) {
            return true ;
        }

        // 已登录，放行
        if (request.getSession().getAttribute("user") != null) {
            return true ;
        }
        if (request.getSession().getAttribute("admin") != null) {
            return true ;
        }

        // 其他情况拦截
        if (path.contains("back")) {
            response.sendRedirect("/to_admin_login");
        } else {
            response.sendRedirect("/to_login");
        }

        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
