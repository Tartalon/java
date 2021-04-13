package ex004_constructors.default_not_created;

public class Animal {
    private int age;

    //создали конструктор с параметрами
    //конструктор по умолчанию создан не будет, пока не создадим руками
    public Animal (int age) {
        this.age = age;
    }
}
