package ex006_constructor.overload;

public class Animal {
    private int age;
    private int height;

    //перегруженные конструкторы
    public Animal () {
        //задаем начальные параметры полей. Обычно в таких ситуациях параметры задаются по умолчанию
        this.age = 14;
        this.height = 60;
    }

    public Animal (int age) {
        this.age = age;
        this.height = 65;
    }

    public Animal (int age, int height) {
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
