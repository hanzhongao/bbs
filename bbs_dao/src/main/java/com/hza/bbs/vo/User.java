package com.hza.bbs.vo;

import java.math.BigInteger;

/**
 * Create by hza
 * 2019-11-11 11:18
 * CREATE TABLE `user` (
 *   `id` bigint(20) NOT NULL AUTO_INCREMENT,
 *   `username` varchar(45) COLLATE utf8_bin DEFAULT NULL COMMENT '用户名',
 *   `password` varchar(45) COLLATE utf8_bin DEFAULT NULL COMMENT '密码',
 *   `email` varchar(45) COLLATE utf8_bin DEFAULT NULL COMMENT '邮箱',
 *   `userStatus` int COMMENT '用户状态 0 正常 1 锁定 2 删除',
 *   PRIMARY KEY (`id`)
 * ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
 */
public class User {                // 用户表
    private Integer id ;           // 用户编号
    private String username ;      // 用户名
    private String password ;      // 密码
    private String email ;         // 邮箱
    private Integer userStatus ;   // 用户状态 0 正常 1 锁定 2 删除

    public User() {
    }

    public User(Integer id, String username, String password, String email, Integer userStatus) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.userStatus = userStatus;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", userStatus=" + userStatus +
                '}';
    }
}
