public class tascLogicOperations {
//    Имеется 3 переменные типа int x = 5, y = 10, и z = 15;
//    Выполните и рассчитайте результат следующих операций для этих переменных:
//
//  x += y >> x++ * z;
//  z = ++x & y * 5;
//  y /= x + 5 | z;
//  z = x++ & y * 5;
//  x = y << x++ ^ z;

    public static void main(String[] args) {

        int x = 5, y = 10, z = 15;

        x += y >> x++ * z;
        System.out.println("x += y >> x++ * z\t\tОтвет  x = " + x);

        z = ++x & y * 5;
        System.out.println("z = ++x & y * 5\t\t\tОтвет  z = " + z);

        y /= x + 5 | z;
        System.out.println("y /= x + 5 | z\t\t\tОтвет  y = " + y);

        z = x++ & y * 5;
        System.out.println("z = x++ & y * 5z\t\tОтвет  z = " + z);

        x = y << x++ ^ z;
        System.out.println("x = y << x++ ^ z\t\tОтвет  x = " + x);
    }
}
