import java.util.Scanner;

public class Task_Calculator {

    static double getAverage (double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c;

        System.out.print("Введите первое число: ");
        a = in.nextDouble();

        System.out.print("Введите второе число: ");
        b = in.nextDouble();

        System.out.print("Введите третее число: ");
        c = in.nextDouble();

        System.out.println("Среднее арифметическое - " + getAverage(a, b, c));
    }
}
