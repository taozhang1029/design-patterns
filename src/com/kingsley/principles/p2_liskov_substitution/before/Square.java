package com.kingsley.principles.p2_liskov_substitution.before;

/**
 * @author ZhangTao
 * @date 2022/6/22
 * @desc
 */
public class Square extends Rectangle {

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
}
