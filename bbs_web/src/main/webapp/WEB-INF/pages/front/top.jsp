<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>慕课论坛</title>
    <link rel="stylesheet" href="/static/css/all-df86af5803.css">

    <script src="/vendor/jquery/jquery-1.11.1.min.js"></script>
    <script src="/vendor/jquery/jquery_ui/jquery-ui.min.js"></script>

    <script src="/assets/admin-tools/admin-forms/js/jquery.validate.min.js"></script>
    <script src="/assets/admin-tools/admin-forms/js/additional-methods.min.js"></script>

    <script src="/assets/admin-tools/admin-forms/js/jquery-ui-datepicker.min.js"></script>

    <script src="/assets/js/utility/utility.js"></script>
    <script src="/assets/js/demo/demo.js"></script>
    <script src="/assets/js/main.js"></script>

    <script type="text/javascript" src="/js/pages.js"></script>
    <script type="text/javascript" src="/js/items.js"></script>

</head>
<body class="forum" data-page="forum">
<div class="header">
    <nav class="navbar navbar-inverse navbar-fixed-top navbar-default">
        <div class="container">
            <div class="navbar-header" id="navbar-header">
                <a href="/front/post/list" class="navbar-brand"><img src="/images/logo.png">
                </a>
            </div>
            <div id="main-nav-menu">
                <ul class="nav navbar-nav">
                    <li class="active"><a href=""><i class="fa-home"></i> <span
                    <%--<li class="active"><a href=""><i class="fa"></i> <span--%>
                            class="hidden-xs hidden-sm">首页</span></a></li>
                    <%--<li class="hidden-sm hidden-xs"><a href="thread.html"><i class="fa fa-comments-o"></i> 话题</a></li>--%>
                    <li class="hidden-sm hidden-xs"><a href="thread.html"><i class="fa"></i> 话题</a></li>

                </ul>
            </div>

            <ul class="nav navbar-nav navbar-right">
                <li class="nav-search hidden-xs hidden-sm">
                    <form method="GET" action="###" accept-charset="UTF-8"
                          class="navbar-form form-search active" target="_blank">
                        <div class="form-group">
                            <input placeholder="搜索" class="form-control" name="q" type="search">
                        </div>
                        <%--<i class="fa fa-search"></i>--%>
                        <i class="fa"></i>
                    </form>
                </li>

                <c:if test="${sessionScope.user!=null}">
                    <!-- 登录成功要显示的内容 -->
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
                            ${sessionScope.user.username}
                            <span class="caret"></span></a>
                        <button class="navbar-toggle" type="button" data-toggle="dropdown" role="button"
                                aria-expanded="false">
                            <span class="sr-only">Toggle</span>
                            <i class="fa fa-reorder"></i>
                            <%--<i class="fa"></i>--%>
                        </button>
                        <ul class="dropdown-menu" role="menu">
                            <li class="list-group-item"><a href="my.html">我的主页</a></li>
                            <li>
                                <div class='divider'></div>
                            </li>
                            <li><a href="my.html">个人设置</a></li>

                            <li><a href="score.html">我的积分</a></li>
                            <li class='divider'></li>
                            <%--<li><a href="###" onclick=" return confirm('你确定要退出吗?')"><i class="fa fa-sign-out"></i> 退出--%>
                            <li><a href="/quit" onclick=" return confirm('你确定要退出吗?')"><i class="fa"></i> 退出
                            </a></li>
                        </ul>
                    </li>
                </c:if>
                <c:if test="${sessionScope.user==null}">
                    <!-- 未登录显示的内容 -->
                    <li><a href="/to_reg" id="signup-btn">注册</a></li>
                    <li><a href="/to_login" id="login-btn">登录</a></li>

                </c:if>
            </ul>
        </div>
    </nav>
</div>