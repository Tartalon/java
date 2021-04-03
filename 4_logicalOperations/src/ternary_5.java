public class ternary_5 {
    public static void main(String[] args) {

        int x = 10, y = -5;
        String quadrant0, quadrant1, quadrant2;

//        Вложенность иернарного оператора

        quadrant0 = (x > 0) ? ((y > 0) ? "I квандрант" : "IV квандрант") : ((y > 0) ? "II квандрант" : "III квандрант");

        quadrant1 = x > 0 ? (y > 0 ? "I квандрант" : "IV квандрант") : (y > 0 ? "II квандрант" : "III квандрант");

        quadrant2 = x > 0 ? y > 0 ? "I квандрант" : "IV квандрант" : y > 0 ? "II квандрант" : "III квандрант";

        System.out.println(quadrant0);
        System.out.println(quadrant1);
        System.out.println(quadrant2);

    }
}
