public class shortLogikComputing {
    // Короткозамкнутое вычисление
    //Если значение первого операнда в операции AND (&&) ложно, то второй операнд не вычесляется
    //т.к. полное выражение все равно будет ложным

    public static void main(String[] args) {
        final int MIN_VALUE = 1;
        int denominator = 0;
        int item = 2;

        // Если бы это выражение вычеслялось полностью, то операция деления во втором операнде
        // генерировала бы ошибку деления на 0.

        if((denominator != 0) && item / denominator > MIN_VALUE) {     //попробовать оставить один &
            System.out.println("Мы в блоке if");
        } else {
            System.out.println("Мы в блоке else");
        }
    }
}
