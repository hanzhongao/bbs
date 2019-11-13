<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%--<link href="/css/pagination.css" rel="stylesheet" type="text/css">--%>
<%--<script type="text/javascript" src="/js/jquery-1.11.3.js"></script>--%>
<%--<script type="text/javascript" src="/js/jquery.pagination.js"></script>--%>
<%--<%--%>
    <%--// 获取请求的上下文--%>
    <%--String context = request.getContextPath();--%>
<%--%>--%>

<%--<script type="text/javascript">--%>

    <%--// 点击分页按钮以后触发的动作--%>
    <%--function handlePaginationClick(new_page_index, pagination_container) {--%>
        <%--$("#stuForm").attr("action", "<%=context %>getPost?id=${post.id}pageNum=" + (new_page_index+1));--%>
        <%--$("#stuForm").submit();--%>
        <%--return false;--%>
    <%--}--%>

    <%--$(function () {--%>
        <%--$("#News-Pagination").pagination(${postNum}, {--%>
            <%--items_per_page:${pagesize}, // 每页显示多少条记录--%>
            <%--&lt;%&ndash;current_page: ${result.currentPage} -1, // 当前显示第几页数据&ndash;%&gt;--%>
            <%--num_display_entries: 5, // 分页显示的条目数--%>
            <%--next_text: "下一页",--%>
            <%--prev_text: "上一页",--%>
            <%--num_edge_entries: 2, // 连接分页主体，显示的条目数--%>
            <%--callback: handlePaginationClick--%>
        <%--});--%>
    <%--});--%>
<%--</script>--%>

<jsp:include page="top.jsp"/>
<div id="main" class="main-container container">
    <!-- 首页通栏(4个推荐位) -->
    <div class="col-md-9 threads-index main-col">
        <div class="panel panel-default">

            <div class="panel-heading">
                <div class="pull-left hidden-sm hidden-xs">
                    <%--<i class="fa fa-list"></i> 首页--%>
                    <i class="fa"></i> 首页
                </div>
                <ul class="pull-right list-inline remove-margin-bottom thread-filter">
                    <li>
                        <a href="thread.html">
                            <%--<i class="fa fa-history"></i> 最新话题--%>
                            <i class="fa"></i> 最新话题
                        </a>
                    </li>
                    <li>
                        <a href="thread.html">
                            <%--<i class="fa fa-diamond"> </i> 优质帖子--%>
                            <i class="fa"> </i> 优质帖子
                        </a>
                    </li>
                    <li>
                        <a href="thread.html">
                            <%--<i class="fa fa-thumbs-o-up"> </i> 最多按赞--%>
                            <i class="fa"> </i> 最多按赞
                        </a>
                    </li>
                    <li>
                        <a href="thread.html">
                            <%--<i class="fa fa-eye"></i> 等待回复--%>
                            <i class="fa"></i> 等待回复
                        </a>
                    </li>
                </ul>
                <div class="clearfix"></div>
            </div>


            <div class="panel-body remove-padding-horizontal">
                <ul class="list-group row thread-list">

                    <!-- 显示帖子，每个li显示一个帖子的内容 -->
                    <c:forEach items="${posts}" var="post">
                        <li class="list-group-item media " style="margin-top: 0px;">
                            <a class="pull-right" href="getPost?id=${post.id}">
                                <span class="badge badge-reply-count"> ${post.count} </span>
                            </a>
                            <div class="avatar pull-left">
                                <a href="post.html">
                                    <img class="media-object img-thumbnail avatar-48" alt="imooc"
                                         src="/images/avatar.jpg"/>
                                </a>
                            </div>
                            <div class="infos">
                                <div class="media-heading">
                                        <%--<i class="fa fa-thumb-tack text-danger"></i>--%>
                                    <i class="fa text-danger"></i>
                                    <a href="getPost?id=${post.id}" title="${post.title}">
                                            ${post.title}  <!-- 此处显示帖子标题 -->
                                    </a>
                                </div>
                                <div class="media-body meta">
                                    <a href="post.html">
                                            <%--<span class="fa fa-thumbs-o-up"> 10 </span>--%>
                                        <span>赞: 10 </span>
                                    </a>
                                    <span> • </span>
                                        <%--<span>回复</span>--%>
                                    <a href="getPost?id=${post.id}">
                                        回复
                                    </a>
                                    <a href="post.html">
                                            ${post.username}
                                    </a>
                                    <span> • </span>
                                    <span class="timeago " data-toggle="tooltip" data-placement="top"
                                          title=""><spring:eval expression="post.createTime"/></span>
                                </div>
                            </div>
                        </li>

                    </c:forEach>
                </ul>
            </div>

            <div  class="panel-footer text-right remove-padding-horizontal pager-footer">
                <!-- Pager -->

                <ul class="pagination">

                <li><a href=""><span><div id="News-Pagination"></div></span></a></li>


                </ul>

            </div>


        </div>

    </div>

    <jsp:include page="right.jsp"/>

<jsp:include page="foot.jsp"/>