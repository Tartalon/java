import java.util.Scanner;

public class switch_case_3 {
    public static void main(String[] args) {

        System.out.println("Введите номер дня недели (1 - 7)");
        Scanner in = new Scanner(System.in);
        String day = in.next();

        switch (day) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                System.out.println("Будний день");
                break;
            case "6":
            case "7":
                System.out.println("Выходной день");
                break;
            default:
                System.out.println("Не корректное значение");
                break;
        }
    }
}
