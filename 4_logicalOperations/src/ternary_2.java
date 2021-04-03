public class ternary_2 {

    public static void main(String[] args) {
        int a = 1, b = 2,  c = -5, max = 0;

        max = a < b ? (c = a) : (c = b);

        System.out.println(max);
    }
}
