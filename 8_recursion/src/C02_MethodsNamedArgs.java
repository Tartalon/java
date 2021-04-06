public class C02_MethodsNamedArgs {

    static int difference (int height, int width) {
        return height - width;
    }

    public static void main(String[] args) {
        int difference;
        difference = difference(6, 5);

        System.out.println("Разность равна: " + difference);
    }
}
