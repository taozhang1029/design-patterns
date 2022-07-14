package com.kingsley.principles.p5_demeter;

/**
 * @author ZhangTao
 * @date 2022/7/14
 * @desc
 */
public class Fans {

    private String name;

    public Fans(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
