import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {

        System.out.println("Введите число 1 или 2:");

        Scanner in = new Scanner(System.in);
        String number = in.next();

        switch (number) {
            case "1": {
                System.out.println("Один");
                break;
            }
            case "2": {
                System.out.println("Два");
                break;
            }
            default: {
                System.out.println("Не верное значение");
            }
        }
    }
}
