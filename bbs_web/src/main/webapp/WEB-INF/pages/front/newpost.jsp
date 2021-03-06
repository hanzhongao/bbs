<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.hza.bbs.global.Content" %>
<jsp:include page="top.jsp"/>
<div class="thread_create">

    <div class="col-md-9 main-col">
        <div class="panel panel-default corner-radius">
            <div class="panel-heading">发表新帖</div>
            <div class="panel-body">
                <div class="reply-box form box-block">
                    <form:form modelAttribute="newPost" method="POST" action="newPost" accept-charset="UTF-8" id="thread_create_form" cssClass="create_form">

                        <div class="form-group">
                            <form:input cssClass="form-control" path="title" placeholder="标题" />
                        </div>

                        <div class="form-group">
                            <form:select cssClass="form-control selectpicker" path="category" items="${types}">
                            </form:select>
                        </div>
                        <!-- editor start -->
                        <div class="editor-toolbar">

                            <ul class="nav nav-pills" style="clear:none;">
                                <li class="edit active"><a href="#">编辑</a></li>

                            </ul>
                        </div>                    <!-- end -->
                        <div class="form-group">
                            <form:textarea cssClass="post-editor form-control" rows="15" style="overflow:hidden" id="body_field" placeholder="请使用Markdown撰写内容" path="content" cols="50"></form:textarea>
                        </div>

                        <div class="form-group">
                            <form:select cssClass="form-control js-tag-tokenizer" path="tag" items="${tags}">
                            </form:select>
                            <small>
                                请填写标签
                            </small>
                        </div>

                        <div class="form-group status-post-submit">
                            <input class="btn btn-primary col-xs-2" id="thread-create-submit" type="submit" value="发布">

                        </div>

                        <div class="box preview markdown-body" id="preview-box" style="display:none;"></div>

                    </form:form>
                </div>
            </div>
        </div>

    </div>

    <div class="col-md-3 side-bar">


        <div class="panel panel-default corner-radius help-box">
            <div class="panel-heading text-center">
                <h3 class="panel-title">发帖提示</h3>
            </div>
            <div class="panel-body">
                <ul class="list">
                    <li>主题标题
                        <p>请在标题中描述内容要点。</p>
                    </li>
                    <li>选择节点
                        <p>请为你的主题选择一个节点。恰当的归类会让你发布的信息更有用。</p>
                    </li>
                    <li>正文
                        <p>imooc 支持 <span style="font-family: Consolas, 'Panic Sans', mono"><a href="https://help.github.com/articles/github-flavored-markdown" target="_blank">GitHub Flavored Markdown</a></span> 文本标记语法。你可以在页面下方实时预览正文的实际渲染效果。</p>
                    </li>
                </ul>
            </div>
        </div>

        <div class="panel panel-default corner-radius help-box">
            <div class="panel-heading text-center">
                <h3 class="panel-title">社区指导原则</h3>
            </div>
            <div class="panel-body">
                <ul class="list">
                    <li>尊重原创
                        <p>请不要在 imooc 发布任何盗版链接，包括软件、音乐、电影等。</p>
                    </li>
                    <li>友好互助
                        <p>保持对陌生人的友善。用知识去帮助别人。</p>
                    </li>
                </ul>
            </div>
        </div>

    </div>
</div>
</div>
<jsp:include page="foot.jsp"/>