package com.kingsley.patterns.singleton.break_means.resolve.reflect;

import java.io.Serializable;

/**
 * @author ZhangTao
 * @date 2022/7/20
 * @desc
 */
public class Singleton implements Serializable {

    /**
     * 是否为第一次调用构造方法
     */
    private static boolean flag = false;

    /**
     * 1.私有构造方法
     */
    private Singleton() {
        synchronized (Singleton.class) {
            if (flag) {
                // 非第一次访问，则抛异常
                throw new RuntimeException();
            }
            System.out.println("私有构造方法创建单例对象");
            flag = true;
        }
    }

    /**
     * 3.提供一个公共的访问方式，让外界获取该对象
     *
     * @return 单例对象
     */
    public static Singleton getInstance() {
        return Singleton.SingletonHolder.INSTANCE;
    }

    /**
     * 2.声明静态内部类
     */
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
}
