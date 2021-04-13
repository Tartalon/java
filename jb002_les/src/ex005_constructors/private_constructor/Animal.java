package ex005_constructors.private_constructor;

public class Animal {
    private int age;

    //объявление конструктора является приватным.
    // Может быть использован в рамках данного класса
    private Animal (int age) {
        this.age = age;
    }
}
