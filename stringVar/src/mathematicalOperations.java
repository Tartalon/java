public class mathematicalOperations {
    public static void main(String[] args) {
        int x = 10;
        int y = 12;
        int z = 3;

        x += y - x++ * z;

        System.out.println(x);
    }
}
