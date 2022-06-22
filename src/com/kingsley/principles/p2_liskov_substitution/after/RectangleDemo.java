package com.kingsley.principles.p2_liskov_substitution.after;

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
        square.setSize(10);
        // resize(square); // 无法编译，解决了“违反里氏代换原则”的问题
        printLengthAndWidth(rectangle);
    }

    public static void resize(Rectangle rectangle) {
        // 判断宽如果比长小，进行扩宽工作
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    public static void printLengthAndWidth(Quadrilateral quadrilateral) {
        System.out.printf("四边方形的长=%s, 宽=%s%n", quadrilateral.getLength(), quadrilateral.getWidth());
    }

}
