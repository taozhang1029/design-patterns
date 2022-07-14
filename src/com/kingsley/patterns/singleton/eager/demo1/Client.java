package com.kingsley.patterns.singleton.eager.demo1;

/**
 * @author ZhangTao
 * @date 2022/7/15
 * @desc
 */
public class Client {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }

}
