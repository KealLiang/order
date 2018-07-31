package com.lesson.util;

/**
 * @author lsr
 * @Date 2018-07-27
 * @Desc 计算工具类
 */
public class CalculateUtil {

    /**
     * 开平方（二分法）
     * @param n 待开方的数
     * @param p 精度 abs(/n-r) < p
     * @return
     */
    public static double squr(double n, double p){
        double r = 0;
        //TODO

        return r;
    }

    /**
     * 绝对值
     * @param n
     * @return
     */
    public static double abs(double n){
        return n > 0 ? n : -n;
    }

    /**
     * 取平方
     * @param n
     * @return
     */
    public static double square(double n){
        return n * n;
    }
}
