package com.kingsley.patterns.singleton.break_means.resolve.serialize;

import java.io.Serializable;

/**
 * 解决序列化方式破环单例模式的手段：添加 readResolve 方法，让该方法返回单例对象
 * readResolve方法 在反序列化时会自动调用，将该方法的返回值直接返回
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

    public Object readResolve() {
        System.out.println("执行Singleton#readResolve方法");
        return SingletonHolder.INSTANCE;
    }
}