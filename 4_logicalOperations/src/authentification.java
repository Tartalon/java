
import java.util.Scanner;

public class authentification {

    public static void main(String[] args) {
        String login = "Admin";
        String password = "P@sswOrd";

        Scanner in = new Scanner(System.in);
        System.out.print("Введите логин: ");

        String usersLogin = in.next();

        if (login.equals(usersLogin)) {
            System.out.print("Введите pasword: ");
            String usersPassword = in.next();

            if (password.equals(usersPassword)) {
                System.out.println("Здравствуйте " + usersLogin + " Вы вошли в систему");
            } else {
                System.out.println("Вы ввели не верный пароль");
            }
        } else {
            System.out.println("Нет пользователя с таким именем");
        }
    }
}
