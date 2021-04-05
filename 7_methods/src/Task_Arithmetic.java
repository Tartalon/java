import java.util.Scanner;

public class Task_Arithmetic {

    static void add (int a, int b) {
        System.out.println("Результат сложения: " + (a + b));
    }

    static void sub (int a , int b) {
        System.out.println("Результат вычитания: " + (a - b));
    }

    static void mul (int a, int b) {
        System.out.println("Результат умножения: " + (a * b));
    }

    static void div (float a, float b) {
        System.out.println("Результат деления: " + (a / b));
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a, b;
        String sign;

        System.out.print("Введите первый операнд: ");
        a = in.nextInt();

        System.out.print("Введите второй операнд: ");
        b = in.nextInt();

        System.out.print("Введите знак математической операции: ");
        sign = in.next();

        switch (sign) {
            case "+": {
                add(a, b);
                break;
            }
            case "-": {
                sub(a, b);
                break;
            }
            case "*": {
                mul(a, b);
                break;
            }
            case "/": {
                if (b == 0) {
                    System.out.println("Деление на 0 запрещено");
                } else {
                    div(a, b);
                }
                break;
            }
        }
    }
}
