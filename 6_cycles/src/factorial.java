public class factorial {
    public static void main(String[] args) {

        int counter = 4;
        int factorial = 1;

        System.out.print("Факториал числа: " + counter + "! = ");

        do {
            factorial *= counter--;

        }
        while (counter > 0);

        System.out.print(factorial);
    }
}
