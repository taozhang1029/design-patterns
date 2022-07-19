package com.kingsley.patterns.singleton.break_means.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author ZhangTao
 * @date 2022/7/20
 * @desc 反射破坏单例
 */
public class ReflectionBreakTestClient {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Singleton> singletonClazz = Singleton.class;
        Constructor<Singleton> constructor = singletonClazz.getDeclaredConstructor();
        // 因为构造方法是私有的，所以要关闭访问检查
        constructor.setAccessible(true);
        Singleton instance1 = constructor.newInstance();
        Singleton instance2 = constructor.newInstance();
        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance1 == instance2);
    }

}
