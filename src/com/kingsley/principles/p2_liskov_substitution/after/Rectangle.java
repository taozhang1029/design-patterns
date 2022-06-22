package com.kingsley.principles.p2_liskov_substitution.after;

/**
 * @author ZhangTao
 * @date 2022/6/23
 * @desc 长方形
 */
public class Rectangle implements Quadrilateral {

    private double length;

    private double width;

    @Override
    public double getLength() {
        return this.length;
    }

    @Override
    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

}
