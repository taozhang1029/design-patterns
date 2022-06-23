package com.kingsley.principles.p3_dependency_reverse.after;

/**
 * @author ZhangTao
 * @date 2022/6/23
 * @desc
 */
public class IntelCpu implements Cpu{

    public void run() {
        System.out.println("IntelCpu 正在运行....");
    }

}
