import java.util.Scanner;

public class ternary_3 {
    public static void main(String[] args) {
        String string = "Hello ";

        System.out.println("Введите свой логин");
        Scanner in = new Scanner(System.in);

        String login = in.next();

        string += login.equals("Admin") ? "Administrator" : "User";

        System.out.println(string);
    }
}
