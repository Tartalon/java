import java.util.Arrays;
import java.util.Scanner;

public class Task_ReversedArray {
//    1) Создать метод myReverse(int [] array), который принимает в качестве аргумента массив
//    целочисленных элементов и возвращает инвертированный массив (элементы массива в обратном порядке).
//    2) Создайте метод int []  subArray(int [] array, int index, int count).
//    Метод возвращает часть полученного в качестве аргумента массива,
//    начиная с позиции указанной в аргументе index, размерностью, которая соответствует значению аргумента count.
//
//    Если аргумент count содержит значение больше чем количество элементов,
//    которые входят в выбираемую часть исходного массива (от указанного индекса index,
//    до индекса последнего элемента), то при формировании нового массива размерностью в count,
//    заполните единицами те элементы, которые не были скопированы из исходного массива.

    static int[] myReverse(int [] array) {
        int [] reverse = new int [array.length];
        int c = 0;

        for (int i = array.length - 1; i >= 0 ; i--) {
            reverse[c] = array[i];
            c++;
        }
        return reverse;
    }

    static  int [] subArray(int [] array, int index, int count) {
        int[] tmp = new int[count];

        for (int i = index, k = 0;  k < count; i++, k++) {

            if ((k + index) >= array.length) {
                tmp[k] = 1;
            } else {
                tmp[k] = array[i];
            }
        }
        return tmp;
    }


    public static void main(String[] args) {
        int[] tmp2;
        tmp2 = Task_ReversedArray.subArray(new int[]{1, 2, 9, 6, 5, 8, 10, 4, 2, 7, 12, 45}, 2, 12 );

        Scanner in = new Scanner(System.in);
        System.out.print("Array length: ");
        int arrLength = in.nextInt();

        int [] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("The reverses array is " + Arrays.toString(myReverse(arr)));
        System.out.print("\nSubArray is: ");
        for (int i = 0; i < tmp2.length; i++) {
            System.out.print(tmp2[i] + " ");
        }
    }
}
