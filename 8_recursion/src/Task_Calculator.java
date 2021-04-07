public class Task_Calculator {
//    Создайте метод с именем calculate, который принимает в качестве параметров
//    три целочисленных значения и возвращает значение каждого аргумента, деленного на 5.

    static void calculator (int a, int b, int c) {
        System.out.print(a / 5 + "\n" + b / 5 + "\n" + c / 5);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;

        calculator(a, b, c);
    }
}
