package com.lesson.service.impl;

import com.lesson.service.Jdk8Detail;
import com.lesson.service.Jdk8Feature;

/**
 * @author lsr
 * @Date 2018-07-29
 * @Desc jdk8特性的实现
 */
public class Jdk8Implement implements Jdk8Feature, Jdk8Detail {
    @Override
    public String getName() {
        return this.getClass().getName();
    }

    /**
     * if you implements more than one interface with same default method <em>simultaneously</em>,
     * you must rewrite that default method.
     * @return
     */
    @Override
    public String getStatus() {
        return "myself_happy";
    }


    public static void main(String[] args) {
        Jdk8Implement imp = new Jdk8Implement();
        System.out.println(imp.getName());
        System.out.println(imp.getStatus());
        System.out.println(Jdk8Feature.getDate());
    }
}
