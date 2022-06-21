package com.kingsley.principles.p1_open_close;

/**
 * @author ZhangTao
 * @date 2022/6/21
 * @desc
 */
public class SkinClient {

    public static void main(String[] args) {
        // 1、创建搜狗输入法对象
        SouGouInput input = new SouGouInput();

        // 2、创建皮肤对象
        // DefaultSkin skin = new DefaultSkin();
        CustomSkin skin = new CustomSkin();

        // 3、设置皮肤对象到输入法
        input.setSkin(skin);

        // 4、显示皮肤
        input.display();
    }

}
