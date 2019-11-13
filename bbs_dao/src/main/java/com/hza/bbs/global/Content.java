package com.hza.bbs.global;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create by hza
 * 2019-11-12 14:26
 */
public class Content {

    // 帖子类型
    private static final String TYPE_HELP = "帮助" ;
    private static final String TYPE_GUIDE = "使用指南" ;
    private static final String TYPE_SHARE = "技术分享" ;

    public static List<String> getType() {
        List<String> types = new ArrayList<>() ;
        types.add(TYPE_HELP ) ;
        types.add(TYPE_GUIDE) ;
        types.add(TYPE_SHARE) ;
        return types ;
    }

    // 标签
    private static final String TAG_JAVA = "Java" ;
    private static final String TAG_PYTHON = "Python" ;
    private static final String TAG_ORACLE = "Oracle" ;

    public static List<String> getTags() {
        List<String> tags = new ArrayList<>() ;
        tags.add(TAG_JAVA ) ;
        tags.add(TAG_PYTHON) ;
        tags.add(TAG_ORACLE) ;
        return tags ;
    }

    // 用户状态
    private static final String STATUS_LOCKED = "锁定" ;
    private static final String STATUS_NORMAL = "正常" ;
    private static final String STATUS_DELETE = "删除" ;

    public static Map<Integer, String> getStatus() {
        Map<Integer, String> status = new HashMap<>() ;
        status.put(0, STATUS_NORMAL) ;
        status.put(1, STATUS_LOCKED) ;
        status.put(2, STATUS_DELETE) ;
        return status ;
    }
}
