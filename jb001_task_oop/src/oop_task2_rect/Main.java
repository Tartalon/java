package oop_task2_rect;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        Scanner in = new Scanner(System.in);

        System.out.print("Введите длину стороны 1: ");
        rectangle.side1 = in.nextDouble();

        System.out.print("Введите длину стороны 2: ");
        rectangle.side2 = in.nextDouble();

        System.out.println("Периметр прямоугольника = "
                + rectangle.perimeterCalculator(rectangle.side1, rectangle.side2));

        System.out.println("Площадь прямоугольника = "
                + rectangle.areaCalculator(rectangle.side1, rectangle.side2));
    }
}
