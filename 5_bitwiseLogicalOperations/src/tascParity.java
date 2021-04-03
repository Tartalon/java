import java.util.Scanner;

public class tascParity {
//    Известно, что у четных чисел младший бит имеет значение 0
//    Напишите программу, которая будет выполнять проверку чисел на четность.
//    Предложите два варианта решения поставленной задачи.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");

        int num = in.nextInt();

        if ((num & 1) == 0) {
            System.out.println("Число " + num + " четное");
        } else {
            System.out.println("Число " + num + " не четное");
        }
    }
}
