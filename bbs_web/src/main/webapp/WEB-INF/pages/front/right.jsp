<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="col-md-3 side-bar">
    <div class="panel panel-default corner-radius">
        <div class="panel-heading">
            <h3 class="panel-title">BBS</h3>
        </div>

        <c:if test="${sessionScope.user!=null}">
            <!-- 登录后显示的内容 -->
            <div class="panel-body text-center">
                <c:if test="${sessionScope.user.userStatus==0}">
                    <a href="/front/post/to_newPost" class="btn btn-primary">
                            <i class="fa"> </i> 发帖
                    </a>
                </c:if>
                <c:if test="${sessionScope.user.userStatus==1}">
                    <span style="color:red">用户已被锁定，请联系管理员！</span>
                </c:if>
            </div>

        </c:if>
        <c:if test="${sessionScope.user==null}">
            <!-- 未登录显示的内容 -->
            <div class="panel-body text-center">
                <a href="/to_reg" class="btn btn-primary">
                    <%--<i class="fa fa-user"> </i> 注册--%>
                    <i class="fa"> </i> 注册
                </a>
            </div>
            <div class="panel-footer text-center">
                已注册用户请 <a href="/to_login">登录</a>
            </div>
        </c:if>


    </div>

    <div class="panel panel-default corner-radius">
        <div class="panel-heading">
            <h3 class="panel-title">热门标签</h3>
        </div>
        <div class="panel-body">
            <div class="badge badge-tag-cloud">
                <a href="">Java</a> &nbsp;&nbsp; <a href="">Python</a>
            </div>
        </div>
    </div>
    <div class="panel panel-default corner-radius">
        <div class="panel-heading">
            <h3 class="panel-title">小贴士</h3>
        </div>
        <div class="panel-body">
            猪有猪的思想，人有人的思想。如果猪有人的思想，那它就不是猪了——是八戒!
        </div>
    </div>

    <div class="panel panel-default corner-radius">
        <div class="panel-heading">
            <h3 class="panel-title">统计信息</h3>
        </div>
        <ul class="list-group">
            <li class="list-group-item">社区会员: ${userNum}</li>
            <li class="list-group-item">主题数: ${postNum}</li>
            <li class="list-group-item">回帖数: ${commentNum}</li>
        </ul>
    </div>


</div>
<div class="clearfix"></div>

</div>