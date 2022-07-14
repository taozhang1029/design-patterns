package com.kingsley.principles.p5_demeter;

/**
 * @author ZhangTao
 * @date 2022/7/14
 * @desc 媒体公司
 */
public class Company {

    private String name;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
