package ex007_overide;

public class DerivedClass extends BaseClass {
    // Переопределение метода базового класса

    @Override
    public void method() {
        System.out.println("method from DerivedClass");
    }
}
