public class ternary_4 {
    public static void main(String[] args) {
        int a = 1;
        double b = 0.0;
        int max;

//        выражения [?] и [:] - должны быть одного типа.

        max = (int) ((a > b) ? a : b);

//      ...или так:

        max = (a < b) ? a : (int)b;

        System.out.println(max);
    }
}
