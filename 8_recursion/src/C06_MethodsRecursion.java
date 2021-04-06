public class C06_MethodsRecursion {

    static void recursion(int counter){
        counter--;

        System.out.println("Первая половина метода recursion: " + counter);

        if(counter != 0)
            method(counter);

        System.out.println("Вторая половина метода recursion: " + counter);
    }

    static void method (int counter) {
        System.out.println("Первая половина метода method: " + counter);

        recursion(counter);

        System.out.println("Второя половина метода method: " + counter);
    }

    public static void main(String[] args) {
        method(3);
    }
}
