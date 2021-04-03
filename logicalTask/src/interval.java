import java.util.Scanner;

public class interval {
    public static void main(String[] args) {

        /*
        Напишите программу определения, попадает ли указанное
        пользователем число от 0 до 100 в числовой промежуток
        [0 - 14] [15 - 35] [36 - 50][50 - 100].
        Если да, то укажите, в какой именно промежуток.
        Если пользователь указывает число, не входящее ни в один
        из имеющихся числовых промежутков, то выводится соответствующее
        сообщение.
         */

        System.out.print("Введите число от 0 до 100: ");
        Scanner in = new Scanner(System.in);
        int inNum = in.nextInt();

        if(inNum > 100) {
            System.out.println("Введенное значение больше 100");
        } else if (inNum < 0) {
            System.out.println("Введенное значение меньше 0");
        } else if (inNum >= 0 && inNum <= 14) {
            System.out.println("Введенное значение В диапазоне [0 - 14]");
        } else if (inNum >= 15 && inNum <= 35) {
            System.out.println("Введенное значение В диапазоне [15 - 35]");
        }  else if (inNum >= 36 && inNum <= 50) {
            System.out.println("Введенное значение В диапазоне [36 - 50]");
        } else {
            System.out.println("Введенное значение В диапазоне [51 - 100]");
        }
    }
}
