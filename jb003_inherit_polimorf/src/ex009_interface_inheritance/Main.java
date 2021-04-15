package ex009_interface_inheritance;

public class Main {
    public static void main(String[] args) {

        SomeClass instance = new SomeClass();
        instance.method1();

        // UpCast
        SomeInterface1 instanceUp1 = instance;
        instanceUp1.method1();
//        instanceUp1.method2();
//        instanceUp1.method2();

        // UpCast
        SomeInterface2 instanceUp2 = instance;
        instanceUp2.method2();
//        instanceUp2.method1();
//        instanceUp2.method3();

        // UpCast
        SomeInterface3 instanceUp3 = instance;
        instanceUp3.method3();
//        instanceUp3.method1();
//        instanceUp3.method2();

        SomeClass instanceDown = (SomeClass) instanceUp1;
        instanceDown.method1();
    }
}
