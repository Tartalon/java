package ex010_super_method;

public class DerivedClass extends BaseClass{

    @Override
    public void method() {
        // Вызов метода базового класса
        super.method();

        System.out.println("method from DerivedClass");
    }
}
