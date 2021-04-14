package ex001_inheritance;

public class Main {
    /*
    Базовый класс        -      Производный класс
    Супер класс          -      Подкласс или (сабкласс)
    Родительский класс   -      Дочерний класс
    Родитель             -      Потомок
     */

    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();
        System.out.println(instance.publicField);
        System.out.println(instance.protectedField);
    }
}
