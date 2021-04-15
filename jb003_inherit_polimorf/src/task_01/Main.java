package task_01;

public class Main extends Printer{
    public static void main(String[] args) {
        Printer main = new Main();
        Printer printer = new Printer();

        main.print("Just a red");
        printer.print("Hello", "Vovka");
    }
}
