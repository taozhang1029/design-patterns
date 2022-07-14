package com.kingsley.patterns.singleton.lazy.demo3;

/**
 * @author ZhangTao
 * @date 2022/7/15
 * @desc 懒汉式3-线程安全方式(双重检查锁, Double Check Lock, DCL)
 */
public class Singleton {

    /**
     * 1.私有构造方法
     */
    private Singleton() {
        System.out.println("私有构造方法创建单例对象");
    }

    /**
     * 2.声明Singleton类型的变量，不加volatile的话由于指令重排序，在多线程情况下可能发生空指针问题？？？
     */
    private static volatile Singleton instance;

    /**
     * 3.提供一个公共的访问方式，让外界获取该对象
     * @return 单例对象
     */
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
