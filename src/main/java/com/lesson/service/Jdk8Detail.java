package com.lesson.service;

import java.util.Date;

/**
 * @author lsr
 * @Date 2018-07-29
 * @Desc jdk8新特性接口
 */
public interface Jdk8Detail {

    String HAPPY = "happy";
    String UNHAPPY = "unhappy";

    /**
     * 待实现，返回实例名称
     * @return
     * @since jdk 1.0
     */
    String getName();

    /**
     * 静态方法，返回当前时间
     * @return
     * @since jdk 1.8
     */
    static String getDate(){
        return new Date().toString();
    }

    /**
     * 默认方法，返回当前状态
     * @return
     * @since jdk 1.8
     */
    default String getStatus(){
        return UNHAPPY;
    }
}
