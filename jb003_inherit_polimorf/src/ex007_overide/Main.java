package ex007_overide;

// Полиморфизм

public class Main {
    public static void main(String[] args) {

        DerivedClass instance = new DerivedClass();
        instance.method();

        // UpCast
        BaseClass instanceUp = instance;
        instanceUp.method();

        // DownCast
        DerivedClass instanceDown = (DerivedClass) instanceUp;
        instanceDown.method();
    }
}
