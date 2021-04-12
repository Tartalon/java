package ex011_packages06_import_static;

import static java.lang.Math.PI;
import static java.lang.Math.cos;

public class Main {
    public static void main(String[] args) {
        //статический импорт Math
        double number = 1;
        double result = cos(PI * number);
        System.out.println(result);
    }
}
