public class Tasc_Bank {
//    Представьте, что вы реализуете программу для банка,
//    которая помогает определить, погасил ли клиент кредит или нет.
//    Допустим, ежемесячная сумма платежа должна составлять 100 грн.
//    Клиент должен выполнить 7 платежей, но может платить реже большими суммами.
//    Т.е., может двумя платежами по 300 и 400 грн. Закрыть весь долг.
//    Создайте метод, который будет в качестве аргумента принимать сумму платежа,
//    введенную экономистом банка. Метод выводит на экран информацию о состоянии кредита
//    (сумма задолженности, сумма переплаты, сообщение об отсутствии долга).


    public static void main(String[] args) {
        payment(500);
        payment(3000);
        payment(2000);

    }

    public static void payment (double money) {
        double credit = 2000;
        double debts;
        double overPayment = 0;

        if (money > credit) {
            overPayment = money - credit;
            System.out.println("Переплата составляет: " + overPayment);
            System.out.println("Кредит погашен");
        } else if (money < credit) {
            debts = credit - money;
            System.out.println("Сумма кредита: " + credit);
            System.out.println("Внесенная сумма: " + money);
            System.out.println("Сумма долга: " + debts);
            System.out.println("Переплата: " + overPayment);
        } else {
            System.out.println("Кредит погашен.");
            System.out.println("Сумма долга: 0" + "\n" + "Переплата: 0");
        }
    }
}
