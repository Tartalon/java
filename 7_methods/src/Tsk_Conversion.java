import java.util.Scanner;

public class Tsk_Conversion {

    static void convertInDollars (float amount){
        System.out.println("Сумма в долларах США - " + amount * 28.2);
    }

    static void convertInEuro (float amount){
        System.out.println("Сумма в Евро - " + amount * 32.67);
    }

    static void convertInZloty (float amount){
        System.out.println("Сумма в польских злотых - " + amount * 7.12);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        float amountUAH;
        String currencyCode;

        System.out.print("Введите сумму в гривне: ");
        amountUAH = in.nextFloat();

        System.out.print("Введите банковский код валюты в которую перевести: ");
        currencyCode = in.next().toLowerCase();

        switch (currencyCode) {
            case "usd": {
                convertInDollars(amountUAH);
                break;
            }
            case "eur": {
                convertInEuro(amountUAH);
                break;
            }
            case "pln": {
                convertInZloty(amountUAH);
            }
        }

    }

}
