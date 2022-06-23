package com.kingsley.principles.p3_dependency_reverse.after;

/**
 * @author ZhangTao
 * @date 2022/6/23
 * @desc
 */
public class KingstonMemory implements Memory {

    public void save() {
        System.out.println("使用金士顿内存条...");
    }

}
