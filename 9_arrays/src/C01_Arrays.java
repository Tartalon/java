public class C01_Arrays {

    public static void main(String[] args) {

        int [] arr = new int[5];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        System.out.println(arr[3]);

        int [] arr2 = new int[5];
        System.out.println("Пустой int: " + arr2[2]);

        byte [] arr5 = new byte[6];
        System.out.println("Пустой byte: " + arr5[1]);

        char [] arr3 = new char[5];
        System.out.println("Пустой char: " + arr3[4]);

        String [] arr4 = new String[5];
        System.out.println("Пустой string: " + arr4[3]);
    }
}
