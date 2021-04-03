import java.util.Scanner;

public class coffe_machine {
    public static void main(String[] args) {

        System.out.println("Размеры стаканчиков кофе: 1 = Маленький, 2 = Средний, 3 = Большой.");
        System.out.println("Пожалуйста сделайте свой выбор");

        Scanner in = new Scanner(System.in);
        String coffeSize = in.next();

        int cost = 0;

        switch (coffeSize) {
            case "3": {
                cost += 50;
                break;
            }
            case "2": {
                cost += 35;
                break;
            }
            case "1": {
                cost += 30;
                break;
            }
            default: {
                System.out.println("Вы ввели не верное значение");
                break;
            }
        }

        if(cost != 0) {
            System.out.println("Пожалуйста внесите " + cost + "грн.");
            System.out.println("Спасибо");
        } else {
            System.out.println("Повторите выбор");
        }
    }
}
