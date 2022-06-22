package com.kingsley.principles.p2_liskov_substitution.before;

/**
 * @author ZhangTao
 * @date 2022/6/23
 * @desc
 */
public class RectangleDemo {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        resize(rectangle);
        printLengthAndWidth(rectangle);

        System.out.println("=============================");

        Square square = new Square();
        square.setLength(10);
        resize(square); // 死循环
        printLengthAndWidth(rectangle);
    }

    /**
     * 扩宽方法
     *
     * @param rectangle 长方形
     */
    public static void resize(Rectangle rectangle) {
        // 判断宽如果比长小，进行扩宽工作
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    public static void printLengthAndWidth(Rectangle rectangle) {
        System.out.printf("长方形的长=%s, 宽=%s%n", rectangle.getLength(), rectangle.getWidth());
    }

}
