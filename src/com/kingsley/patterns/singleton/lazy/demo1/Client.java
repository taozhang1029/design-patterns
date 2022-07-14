package com.kingsley.patterns.singleton.lazy.demo1;

/**
 * @author ZhangTao
 * @date 2022/7/15
 * @desc
 */
public class Client {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> System.out.println(Singleton.getInstance())).start();
        }
    }

}
