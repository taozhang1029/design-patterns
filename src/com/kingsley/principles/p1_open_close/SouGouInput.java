package com.kingsley.principles.p1_open_close;

/**
 * @author ZhangTao
 * @date 2022/6/21
 * @desc 搜狗输入法皮肤类
 */
public class SouGouInput {

    private AbstractSkin skin;

    /**
     * 显示方法
     */
    public void display() {
        skin.display();
    }

}
