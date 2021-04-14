package task_03;

public class Car {
    private int year;
    private int speed;
    private double weight;
    private String color;

    public Car() {

    }

    public Car(int year) {
        this.year = year;
    }

    public Car (int year, int speed) {
        this.year = year;
        this.speed = speed;
    }

    public Car (int year, int speed, double weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }

    public Car (int year, int speed, double weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
