package com.kingsley.patterns.singleton.break_means.resolve.serialize;

import java.io.*;

/**
 * @author ZhangTao
 * @date 2022/7/20
 * @desc 反射破坏单例
 */
public class ResolveSerializableBreakTestClient {

    public static void main(String[] args) {
        final String objPath = "./obj2.txt";
        Singleton instance = Singleton.getInstance();
        writeObjectToFile(objPath, instance);
        Singleton singleton = readObjectFromFile(objPath, Singleton.class);
        System.out.println(instance == singleton);
        System.out.println(instance);
        System.out.println(singleton);
    }

    private static <T extends Serializable> boolean writeObjectToFile(String filePath, T obj) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(obj);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static <T extends Serializable> T readObjectFromFile(String filePath, Class<T> objClazz) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Object object = ois.readObject();
            if (objClazz.isAssignableFrom(object.getClass())) {
                return (T) object;
            }
            return null;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

}
