package com.kingsley.patterns.singleton.break_means.demo;

import java.io.Serializable;

/**
 * 序列化方式破环单例模式，除枚举实现外，均可被破坏：这里以静态内部类的方式进行演示
 * 要序列化，需要实现序列化接口
 */
public class Singleton implements Serializable {
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