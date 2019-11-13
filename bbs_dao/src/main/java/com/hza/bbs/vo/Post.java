package com.hza.bbs.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Create by hza
 * 2019-11-11 11:23
 * 帖子表
 *   `id` bigint(20) NOT NULL AUTO_INCREMENT,
 *   `username` varchar(45) COLLATE utf8_bin DEFAULT NULL COMMENT '用户名',
 *   `title` varchar(45) COLLATE utf8_bin DEFAULT NULL COMMENT '帖子标题',
 *   `category` varchar(45) COLLATE utf8_bin DEFAULT NULL COMMENT '帖子分类',
 *   `content` text COLLATE utf8_bin COMMENT '帖子内容',
 *   `tag` varchar(20) DEFAULT NULL COMMENT '帖子标签',
 *   `create_time` datetime DEFAULT NULL COMMENT '帖子创建时间',
 *   PRIMARY KEY (`id`)
 * ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
 */
public class Post {
    private Integer id ;
    private String username ;
    private String title ;
    private String category ;
    private String content ;
    private String tag ;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime ;

    private User user ;
    private int count ;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Post() {
    }

    public Post(Integer id, String username, String title, String category, String content, String tag, Date createTime) {
        this.id = id;
        this.username = username;
        this.title = title;
        this.category = category;
        this.content = content;
        this.tag = tag;
        this.createTime = createTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", content='" + content + '\'' +
                ", tag='" + tag + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
