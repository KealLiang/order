package com.lesson.controller;

import com.lesson.common.Operation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * @author lsr
 * @Date 2018-07-29
 * @Desc 我的实验场地
 */
@Controller
@RequestMapping("/my/experiment")
public class MyController {

    @RequestMapping(method = RequestMethod.GET, value = "test")
    public void testMethod() {
        new String();

        new Map<String, String>() {

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public String get(Object key) {
                return null;
            }

            @Override
            public String put(String key, String value) {
                return null;
            }

            @Override
            public String remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map<? extends String, ? extends String> m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set<String> keySet() {
                return null;
            }

            @Override
            public Collection<String> values() {
                return null;
            }

            @Override
            public Set<Entry<String, String>> entrySet() {
                return null;
            }
        };
    }


   /* public static void main(String[] args) {
        Earth earth = Earth.INSTANCE;

//        earth.setName("earth");
        earth.setCenter("sun");
        earth.setMoon("moon");
        earth.setOrbit("黄道面");

        //验证单例
        Earth instance = Earth.getInstance();

        instance.setOrbit("海王星轨道");

        earth.planetBehavior();
        instance.planetBehavior();


        new BigDecimal("6.62");
    }*/

    public static void main(String[] args) {
        for(Operation op : Operation.values()) {
            System.out.printf("3.14 %s 2.71 = %f%n", op.getSymbol(), op.apply(3.14, 2.71));
        }
    }
}
