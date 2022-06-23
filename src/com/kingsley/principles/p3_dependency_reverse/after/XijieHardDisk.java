package com.kingsley.principles.p3_dependency_reverse.after;

/**
 * @author ZhangTao
 * @date 2022/6/23
 * @desc
 */
public class XijieHardDisk implements HardDisk {

    public void write(String data) {
        System.out.println("使用希捷硬盘储存数据：" + data);
    }

    public String read() {
        System.out.println("使用希捷硬盘读取数据");
        return "数据";
    }

}
