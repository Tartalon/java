public class bitwiseOper {
    public static void main(String[] args) {
        byte operand1, operand2;
        int result;

        //Коньюкция
        operand1 = 127;
        operand2 = 1;
        result = operand1 & operand2;

        System.out.println(operand1 + " AND " + operand2 + " = " + result);

        //Дизъюкция
        operand1 = 2;
        operand2 = 1;
        result = operand1 | operand2;

        System.out.println(operand1 + " OR " + operand2 + " = " + result);

        //Исключающее или
        operand1 = 3;
        operand2 = 1;
        result = operand1 ^ operand2;

        System.out.println(operand1 + " XOR " + operand2 + " = " + result);

        //Отрицание
        operand1 = 1;
        result = ~operand1;

        System.out.println("NOT " +  operand1 + " = " + result);

        //Изменение знака числа
        operand1 = 1;
        result = ~operand1;
        result++;

        System.out.println("NOT " +  operand1 + " + 1 = " + result);
    }
}


