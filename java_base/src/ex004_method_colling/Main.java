package ex004_method_colling;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 200, 10, 120);
        Car car2 = new Car();

        System.out.println(car1.getMaxSpeed());

        //вызываем метод класса Car через объект car1
        car1.setMaxSpeed(140);
        int speed = car1.getMaxSpeed();
        System.out.println(speed);

        //вызываем метод класса Car через объект car2
        car2.setMaxSpeed(155);
        System.out.println(car2.getMaxSpeed());
    }
}
