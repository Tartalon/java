package task_03;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(2010);
        car1.setSpeed(100);
        car1.setWeight(1.24);
        car1.setColor("black");

        Car car2 = new Car(2012);
        car2.setSpeed(110);
        car2.setWeight(1.35);
        car2.setColor("green");

        Car car3 = new Car (2014, 120);
        car3.setWeight(1.45);
        car3.setColor("white");

        Car car4 = new Car(2015, 125, 1.5);
        car4.setColor("yellow");

        Car car5 = new Car(2017, 140, 1.53, "grey");
    }
}
