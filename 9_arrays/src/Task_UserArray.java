import java.util.Arrays;
import java.util.Scanner;

public class Task_UserArray {

    static void addArrayElement (int [] array, int value) {
        int [] newArr = new int [array.length + 1];
        newArr[0] = value;

        for (int i = 0; i < array.length; i++) {
            newArr[i + 1] = array[i];
        }
        System.out.println("new array is: " + Arrays.toString(newArr));
    }

    public static void main(String[] args) {
        int [] array = {2, 5, 4, 6, 3, 8};
        int input;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        input = in.nextInt();

        System.out.println("array is: " + Arrays.toString(array));

        addArrayElement(array, input);
    }
}
