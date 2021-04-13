package stat;

public class Car {
    String model;
    String color;

    static double count; //статическая переменная класса. К ней обрашаться через имя класса (Car)

    public static void main(String[] args) {
        Car.count = 1;
        Car.count = 2;
    }
}
