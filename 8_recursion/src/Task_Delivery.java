import java.util.Scanner;

public class Task_Delivery {

    static int getNumberOfRoutes (int clients) {

        int numberOfRoutes = 1;

        if (clients != 1) {
            numberOfRoutes = clients * getNumberOfRoutes(clients - 1);
        }

        return numberOfRoutes;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Сколько клиентов?: ");

        int clientsAmount = in.nextInt();

        System.out.println(getNumberOfRoutes(clientsAmount));
    }
}
