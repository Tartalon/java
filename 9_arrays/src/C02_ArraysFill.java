public class C02_ArraysFill {

    public static void main(String[] args) {

        int [] arr = new int [5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

//        аналог foreach
        System.out.print("\n Foreach: ");
        for (int anArr : arr) {
            System.out.print(anArr + ", ");
        }
    }
}
