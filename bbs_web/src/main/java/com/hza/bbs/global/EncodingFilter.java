package com.hza.bbs.global;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Create by hza
 * 2019-11-11 10:56
 * 编码过滤器
 */
public class EncodingFilter implements Filter {

    private String encoding = "utf-8" ; // 默认编码为 utf-8

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        // 如果能充 web.xml 中获取到编码，则使用配置中的编码, 否则使用 默认编码
        if (filterConfig.getInitParameter("encoding") != null) {
            encoding = filterConfig.getInitParameter("encoding") ;
        }

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest  request  = (HttpServletRequest)  servletRequest ;
        HttpServletResponse response = (HttpServletResponse) servletResponse ;

        request.setCharacterEncoding(encoding);
        response.setCharacterEncoding(encoding);

        filterChain.doFilter(request,response);

    }

    @Override
    public void destroy() {

    }
}
