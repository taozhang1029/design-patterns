package com.kingsley.patterns.singleton.lazy.demo1;

/**
 * @author ZhangTao
 * @date 2022/7/15
 * @desc 懒汉式1-非线程安全方式
 */
public class Singleton {

    /**
     * 1.私有构造方法
     */
    private Singleton() {
        System.out.println("私有构造方法创建单例对象");
    }

    /**
     * 2.声明Singleton类型的变量
     */
    private static Singleton instance;

    /**
     * 3.提供一个公共的访问方式，让外界获取该对象
     * @return 单例对象
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
