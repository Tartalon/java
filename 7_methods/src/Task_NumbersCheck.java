import java.util.Scanner;

public class Task_NumbersCheck {

    static void checkNumber (int number) {

        String negativeOrPositive, simple = "", division = "";

        negativeOrPositive = (number < 0) ? "негатианое" : "позитивное";

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                simple = "не простое";
                break;
            } else {
                simple = "простое";
            }
        }

        if (number % 2 == 0) division += "делится на 2\n";
        if (number % 3 == 0) division += "делится на 3\n";
        if (number % 5 == 0) division += "делится на 5\n";
        if (number % 6 == 0) division += "делится на 6\n";
        if (number % 9 == 0) division += "делится на 9";

        System.out.println("Данное число:\n" + negativeOrPositive + "\n" + simple + "\n" + division);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int inputNumber;

        System.out.print("Введите число для проверки: ");
        inputNumber = input.nextInt();

        checkNumber(inputNumber);
    }

}
