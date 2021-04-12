package ex005_what_is_null;

import ex004_method_colling.Car;

public class MyClass {
    public static void main(String[] args) {
        String str1 = null;  //можно присвоить строке
        Car car1 = null;  //можно присвоить экземпляру класса
//        int i = null;  //нельзя в примитивный тип

//        Integer i2 = null;
//        int i3 = i2;  //NullPointerException (RuntimeException)

        String str2 = (String) null;  //нал пподается кастованию в другие типы
        Car car2 = (Car) null;

        car1.getMaxSpeed();  //NullPointerException (RuntimeException)
    }
}
