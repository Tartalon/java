import java.util.Scanner;

public class tascs_powerOfTwo {
    //Известно, что у чисел, которые являются степенью двойки,
    // только один бит имеет значение 1.
    // Используя IntelliJ IDEA, создайте класс PowerOfTwo.
    // Напишите программу, которая будет выполнять проверку –
    // является ли указанное число степенью двойки или нет

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Проверить число на степень двойки. Введите число: ");

        int num = in.nextInt();

        if (num > 0 && ((num & (num - 1)) == 0)) {
            System.out.println("Введенное число являеться степень двойки");
        } else {
            System.out.println("Введенное число НЕ является степенью двойки");
        }
    }
}

