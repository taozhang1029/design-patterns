package com.kingsley.principles.p5_demeter;

/**
 * @author ZhangTao
 * @date 2022/7/14
 * @desc
 */
public class Star {

    private String name;

    public Star(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
