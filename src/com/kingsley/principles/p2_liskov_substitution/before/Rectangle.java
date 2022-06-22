package com.kingsley.principles.p2_liskov_substitution.before;

/**
 * @author ZhangTao
 * @date 2022/6/22
 * @desc 长方形
 */
public class Rectangle {

    private double length;

    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
