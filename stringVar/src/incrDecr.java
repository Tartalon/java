public class incrDecr {
    public static void main(String[] args) {
        byte a = 5;
        byte b = 3;
        byte c = 0;

//        c = a++ + ++b; // нужно привести к byte
        c = (byte)(a++ + ++b);

        System.out.println(c);
        System.out.println(c + "" + a + "" + b);
    }
}
