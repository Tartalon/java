package task_01;

public class Printer {
    void print(String value) {
        System.out.println((char) 27 + "[31m" + value);
    }
    void print(String value1, String value2) {
        System.out.println((char) 27 + "[32m" + value1 + " " + (char) 27 + "[35m" + value2);
    }
}
