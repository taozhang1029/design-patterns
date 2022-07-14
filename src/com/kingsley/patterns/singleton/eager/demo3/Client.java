package com.kingsley.patterns.singleton.eager.demo3;

/**
 * @author ZhangTao
 * @date 2022/7/15
 * @desc
 */
public class Client {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1 == instance2);
    }

}
