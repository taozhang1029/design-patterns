package com.kingsley.patterns.singleton.eager.demo1;

/**
 * @author ZhangTao
 * @date 2022/7/15
 * @desc 饿汉式-方式1（静态成员变量方式）
 */
public class Singleton {

    /**
     * 1.私有构造方法
     */
    private Singleton() {
        System.out.println("私有构造方法创建单例对象");
    }

    /**
     * 2.在本类中创建本类的对象
     */
    private static final Singleton instance = new Singleton();

    /**
     * 3.提供一个公共的访问方式，让外界获取该对象
     * @return 单例对象
     */
    public static Singleton getInstance() {
        return instance;
    }

}
