package com.lesson.common;

import com.lesson.service.Planet;

/**
 * @author lsr
 * @Date 2018-07-29
 * @Desc 枚举类型单例地球，枚举类型可以<em>实现</em>接口，但是不能<em>继承</em>类
 */
public enum Earth implements Planet {
    INSTANCE;

    /**
     * 获取地球实例
     * @return
     */
    public static Earth getInstance(){
        return INSTANCE;
    }

    private String name;
    private double round;
    private String orbit;
    private String moon;
    private String center;

    public void planetBehavior() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getName())
                .append("围绕着")
                .append(this.getCenter())
                .append("的" + this.getOrbit() + "轨道转动")
                .append("卫星是" + this.getMoon());
        System.out.println(sb.toString());
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRound() {
        return round;
    }

    public void setRound(double round) {
        this.round = round;
    }

    public String getOrbit() {
        return orbit;
    }

    public void setOrbit(String orbit) {
        this.orbit = orbit;
    }

    public String getMoon() {
        return moon;
    }

    public void setMoon(String moon) {
        this.moon = moon;
    }
}
