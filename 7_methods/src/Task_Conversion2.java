
import java.util.Scanner;

public class Task_Conversion2 {

    static void conversion (float a, float b) {
        System.out.print("Результат конвертации: " + (a * b));
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        float money, exchange;

        System.out.print("Введите сумму которую нужно перевести в другую валюту: ");
        money = in.nextFloat();

        System.out.print("Введите курс валют: ");
        exchange = in.nextFloat();

        conversion(money, exchange);
    }
}
