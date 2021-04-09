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

    static void getMinValue(int[] arr) {
        int minValue = arr[0];
        for (int i : arr) {
            if (i < minValue){
                minValue = i;
            }
        }
        System.out.println("Min value is " + minValue);
    }

    static int getSumValues (int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    static void getAverage(int[] arr) {
        int summ = getSumValues(arr);
        double average = (double)summ / arr.length;

        System.out.println("Average is " + average);
    }

    static void getOdd (int[] arr) {
        System.out.print("Odd is ");
        for (int i : arr) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }
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
        getMinValue(array);
        System.out.println("Sum of values is " + getSumValues(array));
        getAverage(array);
        getOdd(array);

    }
}
