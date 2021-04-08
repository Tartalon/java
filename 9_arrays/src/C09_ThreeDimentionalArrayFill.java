public class C09_ThreeDimentionalArrayFill {
    public static void main(String[] args) {

        int [][][] array = {
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                }
        };

        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                for (int j = 0; j <3; j++) {
                    System.out.print(" " + array[i][k][j]);
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
    }
}
