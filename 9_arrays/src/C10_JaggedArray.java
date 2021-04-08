public class C10_JaggedArray {

    public static void main(String[] args) {

        int [][] jagged = new int[3][];

        jagged[0] = new int[] {1, 2};
        jagged[1] = new int[] {1, 2, 3, 4, 5};
        jagged[2] = new int[] {1, 2, 3};

        for (int i = 0; i < jagged.length; i++) {
            for (int k = 0; k < jagged[i].length; k++) {
                System.out.print(" " + jagged[i][k]);
            }
            System.out.print("\n");
        }
    }
}
