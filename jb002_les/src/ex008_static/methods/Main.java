package ex008_static.methods;

public class Main {
    public int count;

    public static void main(String[] args) {
        //вызов статического метода с помощью класса
        Main.doSmth();  //через Класс
        doSmth();  //в самом классе без использования Класса

        //вызов не статического метода или поля из статического контекста запрещенои приводит к ошибке компиляции
        Main m = new Main();
        System.out.println(m.count);
    }

    public static void doSmth() {
        System.out.println("Hello !");
    }
}
