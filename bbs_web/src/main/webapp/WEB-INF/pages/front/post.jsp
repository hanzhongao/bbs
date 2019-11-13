<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="from" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<jsp:include page="top.jsp"/>
<div id="main" class="main-container container">
    <div class="row max-width">
        <div class="col-xs-12">
            <ul class="breadcrumb">
                <li>
                    <a href="list">首页</a>
                    <span><strong>${post.title}</strong></span>
                </li>
            </ul>
        </div>
    </div>

    <div class="col-md-9 threads-show main-col">

        <!-- Thread Detial -->
        <div class="thread panel panel-default">
            <div class="infos panel-heading">

                <div class="pull-right avatar">
                    <a href="my.html"> <img src="/images/avatar.jpg" class="media-object img-thumbnail avatar-64"/> </a>
                </div>

                <h1 class="panel-title thread-title">${post.title}</h1>

                <div class="likes">
                    <a href="javascript:void(0);" data-action="like" data-type="Thread" data-url="#" title="赞"
                       <%--class="fa fa-chevron-up likeable like" data-id="10"> 10</a> <a href="javascript:void(0);"--%>
                       class="fa likeable like" data-id="10">顶: 10</a> <a href="javascript:void(0);"
                                                                                      data-action="unlike"
                                                                                      data-type="Thread" data-url="#"
                                                                                      title="踩"
                                                                                      <%--class="fa fa-chevron-down likeable like"--%>
                                                                                      class="fa likeable like"
                                                                                      data-id="10">踩: 5</a>
                </div>

                <div class="meta inline-block">

                    <a href="my.html"> ${post.username} </a>

                    • 于 <abbr title="<spring:eval expression='post.createTime' />" class="timeago">
                    <spring:eval expression="post.createTime"/></abbr>

                    回复 <a href="my.html"> ${comments[0].username} </a> 于 <abbr title="${comments[0].createTime}" class="timeago">${comments[0].createTime}</abbr>
                    •
                    4050 阅读
                </div>
                <div class="clearfix"></div>
            </div>

            <div class="panel-body content-body">

                <div class="markdown-body" id="emojify">
                    <ul>
                        <li>${post.content}</li>
                    </ul>
                </div>

            </div>

            <div class="panel-footer operate">

                <div class="pull-left" style="font-size:15px;">
                    <a class="" href="http://service.weibo.com/share/share.php?url=http%3A%2F%2Fimooc.com%2Fthread%2F10&type=3&pic=&title=imooc 接下来需要完善的功能"
                       target="_blank" title="分享到微博">
                        <%--<i class="fa fa-weibo"></i>--%>
                        <i class="fa">微博</i>
                    </a> <a href="https://twitter.com/intent/tweet?url=http%3A%2F%2Fimooc.com%2Fthread%2F10&text=imooc 接下来需要完善的功能&via=imooc.com"
                        class="" target="_blank" title="分享到 Twitter">
                    <%--<i class="fa fa-twitter"></i>--%>
                    <i class="fa">推特</i>
                </a> <a href="http://www.facebook.com/sharer.php?u=http%3A%2F%2Fimooc.com%2Fthread%2F10" class=""
                        target="_blank" title="分享到 Facebook">
                    <%--<i class="fa fa-facebook"></i>--%>
                    <i class="fa">脸书</i>
                </a> <a href="https://plus.google.com/share?url=http%3A%2F%2Fimooc.com%2Fthread%2F10" class=""
                        target="_blank" title="分享到 Google Plus">
                    <%--<i class="fa fa-google-plus"></i>--%>
                    <i class="fa">谷歌</i>
                </a>
                </div>

                <div class="pull-right">
          <span class="tag-list hidden-xs">
      Tags:
            <a href="tag.html"><span class="tag">${post.tag}</span></a>
            </span>

                </div>
                <div class="clearfix"></div>
            </div>

            <div class="modal fade" id="exampleModal" tabindex="-1" role="" aria-labelledby="exampleModalLabel">
                <div class="modal-dialog">
                    <div class="modal-content">

                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                    aria-hidden="true">&times;</span></button>
                            <h4 class="modal-title" id="exampleModalLabel">备注内容</h4>
                        </div>

                        <form method="POST" action="" accept-charset="UTF-8">


                            <div class="modal-body">

                                <div class="alert alert-warning">
                                    附加备注, 使用此功能的话, 会给所有参加过讨论的人发送通知.
                                </div>

                                <div class="form-group">
                                    <textarea class="form-control" style="min-height:20px" placeholder="请使用Markdown撰写内容"
                                              name="content" cols="50" rows="10"></textarea>

                                </div>

                            </div>

                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                                <button type="submit" class="btn btn-primary">提交</button>
                            </div>

                        </form>

                    </div>
                </div>
            </div>
        </div>

        <!-- Reply List -->
        <div class="replies panel panel-default list-panel replies-index">
            <div class="panel-heading">
                <div class="total">回复总数: <b> ${count} </b></div>
            </div>

            <c:forEach items="${comments}" var="comment">
                <div class="panel-body">

                    <ul class="list-group row">

                        <li class="list-group-item media " id="reply11">
                            <div class="avatar pull-left">
                                <a href="my.html"> <img class="media-object img-thumbnail avatar" alt="strdemo"
                                                        src="/images/avatar_small.jpg" style="width:48px;height:48px;"/>
                                </a>
                            </div>
                            <div class="infos">
                                <div class="media-heading meta">
                                    <a href="my.html" title="strdemo"
                                       class="remove-padding-left author"> ${comment.username} 回复于 </a>
                                    <abbr class="timeago" title="create_time"><spring:eval expression="comment.createTime"/></abbr> <a
                                        name="reply1" class="anchor" href="#reply1" aria-hidden="true">#1</a>

                                </div>

                                <div class="media-body markdown-reply content-body">
                                        ${comment.content}
                                </div>

                            </div>
                        </li>

                    </ul>
                    <!-- Pager -->
                    <div class="pull-right" style="padding-right:20px">

                    </div>
                </div>
            </c:forEach>
        </div>

        <!-- Reply Box -->
        <div class="panel panel-default">
            <div class="panel-heading">
                发表回复
            </div>

            <div class="panel-body">
                <div class="reply-box form">
                    <c:if test="${sessionScope.user!=null}">
                        <c:if test="${sessionScope.user.userStatus==0}">
                        <!-- 已经登录的情况 -->
                            <form method="POST" action="/front/post/comment" accept-charset="UTF-8" id="thread_create_form" class="create_form">
                                <input type="hidden" name="postId" value="${post.id}">
                                <div class="form-group">
                                    <textarea class="post-editor form-control" rows="5" style="overflow:hidden" id="content" placeholder="请使用Markdown撰写内容" name="content" cols="50"></textarea>
                                </div>
                                <div class="form-group status-post-submit">
                                    <input class="btn btn-primary col-xs-2" id="thread-create-submit" type="submit" value="回复">
                                </div>
                            </form>
                        </c:if>
                        <c:if test="${sessionScope.user.userStatus==1}">
                            <span style="color:red">用户已被锁定，请联系管理员！</span>
                        </c:if>
                    </c:if>
                    <c:if test="${sessionScope.user==null}">
                        <!-- 未登录的情况 -->
                        <div style="padding:20px;">
                            需要 <a class="btn btn-success" href="/to_login">登录</a> 后方可回复, 如果你还没有账号请点击这里 <a
                                class="btn btn-primary" href="/to_reg">注册</a>。
                        </div>
                    </c:if>
                </div>
            </div>
        </div>

    </div>
    <jsp:include page="right.jsp"/>
<jsp:include page="foot.jsp"/>