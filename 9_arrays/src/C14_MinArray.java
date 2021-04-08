public class C14_MinArray {

    public static void main(String[] args) {

        int[] list = {5, 6, -7, -9, 2, 0, 11, -35, 5};

        int min = list[0];

        for (int i = 0; i < list.length; i++) {
            if (list[i] < min)
                min = list[i];
        }
        System.out.println("Min is " + min);
    }
}
