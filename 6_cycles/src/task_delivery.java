import java.util.Scanner;

public class task_delivery {
//    Напишите программу, которая будет рассчитывать,
//    и выводить на экран количество возможных вариантов доставки товара.
//    Для решения задачи, используйте факториал N!, рассчитываемый с помощью цикла do-while.

    public static void main(String[] args) {

        int clients;
        int factorial = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Сколько клиентов?: ");

        clients = input.nextInt();

        do {
            factorial *= clients--;
        }
        while (clients > 0);

        System.out.println("Возможных вариантов доставки: " + factorial);
    }
}
