import java.util.Scanner;

public class C09_Methods {

    static int addTwo(int a) {
        a += 2;
        System.out.println("Значение int a = " + a);
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);

        String number = in.next();
        int result = Integer.parseInt(number);

        System.out.println("Значение result = " + result);
        result = 10;

        result = addTwo(result); //Передалась копия result (10)
        System.out.println(addTwo(result));
        System.out.println(result);
    }
}
