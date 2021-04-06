public class C05_MethodsRecursion {

    static void recursion (int counter) {
        counter--;

        System.out.println("Первая половина метода: " + counter);

        if (counter != 0)
            recursion(counter);

        System.out.println("Вторая половина метода: " + counter);
    }

    public static void main(String[] args) {
        recursion(3);
    }
}
