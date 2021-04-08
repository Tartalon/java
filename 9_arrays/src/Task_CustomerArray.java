import java.util.Arrays;
import java.util.Scanner;

public class Task_CustomerArray {
//    Создать массив размера N элементов, заполнить его произвольными целыми значениями
//    (размер массива задает пользователь).
//    Вывести на экран: наибольшее значение массива, наименьшее значение массива,
//    общую сумму всех элементов, среднее арифметическое всех элементов,
//    вывести все нечетные значения.

    static void getMaxValue(int[] arr) {
        int maxValue = arr[0];
        for (int j : arr) {
            if (j > maxValue) {
                maxValue = j;
            }
        }
        System.out.println("Max value this array is " + maxValue);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        System.out.print("Введите размер массива: ");

        int N = in.nextInt();
        int [] array = new int[N];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));

        getMaxValue(array);
    }
}
