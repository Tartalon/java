package static3;

public class Account {

    int b = 30;
    static int c = 40;
    int z = 50;

    public static void main(String[] args) {
        int a = 10;

        //вывести b, c
        Account acc = new Account();
        System.out.println(acc.b);
        System.out.println(Account.c);
//        System.out.println(z); //со статического метода мы НЕ можем вызвать не статические методы и поля
    }
    void view() {
//        System.out.println(a);
        System.out.println(z);
        System.out.println(b); //с нестатических методов мы можем вызывать статическое поле
    }
}
