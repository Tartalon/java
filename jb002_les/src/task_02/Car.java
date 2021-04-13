package task_02;

public class Car {
    int year;
    String color;

    public Car () {
        year = 2018;
        color = "red";
    }

    public Car (int year) {
        this.year = year;
        color = "yellow";
    }

    public Car (int year, String color) {
        this.year = year;
        this.color = color;
    }
}
