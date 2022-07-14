package com.kingsley.patterns.singleton.eager.demo2;

/**
 * @author ZhangTao
 * @date 2022/7/15
 * @desc 饿汉式-方式2（静态代码块方式）
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
    private static final Singleton instance;

    /**
     * 3. 在静态代码块中赋值
     */
    static {
        instance = new Singleton();
    }

    /**
     * 4.提供一个公共的访问方式，让外界获取该对象
     * @return 单例对象
     */
    public static Singleton getInstance() {
        return instance;
    }

}
