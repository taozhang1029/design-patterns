package com.kingsley.patterns.singleton.lazy.demo4;

/**
 * @author ZhangTao
 * @date 2022/7/15
 * @desc 懒汉式4-静态内部类方式(一种优秀的方式，在不加任何锁的情况下实现线程安全)
 */
public class Singleton {

    /**
     * 1.私有构造方法
     */
    private Singleton() {
        System.out.println("私有构造方法创建单例对象");
    }

    /**
     * 2.声明静态内部类
     */
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * 3.提供一个公共的访问方式，让外界获取该对象
     * @return 单例对象
     */
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
