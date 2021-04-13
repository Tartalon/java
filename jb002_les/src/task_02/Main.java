package task_02;

public class Main {
    public static void main(String[] args) {
        Car carDefault = new Car();
        Car carOneParam = new Car(2019);
        Car carTwoParams = new Car(2020, "green");

        System.out.println("Default: " + carDefault.year + " " + carDefault.color);
        System.out.println("One param: " + carOneParam.year + " " + carOneParam.color);
        System.out.println("Two param: " + carTwoParams.year + " " + carTwoParams.color);
    }
}
