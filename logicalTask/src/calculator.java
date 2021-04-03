import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

/*

Используя IntelliJ IDEA, создайте класс Calculator.
Напишите программу – консольный калькулятор.
Создайте две переменные с именами operand1 и operand2.
Задайте переменным некоторые произвольные значения.
Предложите пользователю ввести знак арифметической операции.
Примите значение, введенное пользователем и поместите его в строковую переменную
 sign.  Для организации выбора алгоритма вычислительного процесса,
 используйте переключатель switch.
 Выведите на экран результат выполнения арифметической операции.
 В случае использования операции деления, организуйте проверку попытки деления
 на ноль. И если таковая имеется, то отмените выполнение арифметической операции
 и уведомите об ошибке пользователя.

 */

        double operand1 = 3;
        double operand2 = 5;

        System.out.print("Введите знак арифметической операции: ");
        Scanner in = new Scanner(System.in);
        String sign = in.next();

        switch (sign) {
            case "-": {
                System.out.println(operand1 + " " +  sign + " " + operand2 + " = " + (operand1 - operand2));
                break;
            }
            case "+": {
                System.out.println(operand1 + " " +  sign + " " + operand2 + " = " + (operand1 + operand2));
                break;
            }
            case "*": {
                System.out.println(operand1 + " " +  sign + " " + operand2 + " = " + (operand1 * operand2));
                break;
            }
            case "/": {
                if(operand2 == 0) {
                    System.out.println("Ошибка, деление на 0");
                } else {
                    System.out.println(operand1 + " " +  sign + " " + operand2 + " = " + (operand1 / operand2));
                }
                break;
            }
            default: {
                System.out.println("Нет такого знака");
            }
        }
    }
}
