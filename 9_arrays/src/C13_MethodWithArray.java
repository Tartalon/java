public class C13_MethodWithArray {

    static int[] modifyArrray (int [] array, int modifier) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * modifier;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4};

        myArray = modifyArrray(myArray, 5);

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + ", ");
        }
    }
}
