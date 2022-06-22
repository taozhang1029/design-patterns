package com.kingsley.principles.p2_liskov_substitution.after;

/**
 * @author ZhangTao
 * @date 2022/6/23
 * @desc
 */
public class Square implements Quadrilateral {

    private double size;

    @Override
    public double getLength() {
        return this.size;
    }

    @Override
    public double getWidth() {
        return this.size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
