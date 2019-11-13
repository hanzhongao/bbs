package com.hza.bbs.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Create by hza
 * 2019-11-11 11:30
 * 用户回复表
 *   private Integer id          ; // bigint(20) NOT NULL AUTO_INCREMENT,
 *   private String  user_id     ; // bigint(20) NOT NULL COMMENT '回复用户id',
 *   private String  username    ; // varchar(45) COLLATE utf8_bin DEFAULT NULL COMMENT '回复用户名',
 *   private String  content     ; // varchar(2000) COLLATE utf8_bin DEFAULT NULL COMMENT '回复内容',
 *   private Date    create_time ; // datetime DEFAULT NULL COMMENT '回复时间',
 *   private Integer post_id     ; // bigint(20) NOT NULL COMMENT '对应的帖子id',
 *   PRIMARY KEY (id)
 */
public class Comment {
    private Integer id          ; // 回复记录id
    private String  userId     ; // 回复用户id
    private String  username    ; // 回复用户名
    private String  content     ; // 回复内容
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date    createTime ; // 回复时间
    private Integer postId     ; // 对应的帖子id

    private User user ;
    private Post post ;

    public Comment() {
    }


    public Comment(Integer id, String userId, String username, String content, Date createTime, Integer postId) {
        this.id = id;
        this.userId = userId;
        this.username = username;
        this.content = content;
        this.createTime = createTime;
        this.postId = postId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
                ", postId=" + postId +
                '}';
    }
}
