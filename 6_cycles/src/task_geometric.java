public class task_geometric {
//    Используя циклы и метод: System.out.print("*"),
//    System.out.print(" "), System.out.print("\n") (для перехода на новую строку).
//    Выведите на экран:
//     прямоугольник
//     прямоугольный треугольник
//     равносторонний треугольник
//     ромб

    public static void main(String[] args) {

//        for (int i = 0; i <= 5; i++) {
//
//            for (int k = 0; k <= 10; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i <= 5; i++) {
//
//            for (int k = -1; k < i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for (int i = 0; i <= 5; i++) {
//
//           for (int k = 5; k > i; k--) {
//               System.out.print("*");
//           }
//            System.out.println();
//        }

        for (int i = 0; i <= 5; i++) {

            for (int k = 5; k > i; k--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            for (int p = 0; p < i; p++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }

        for (int i = 5; i >= 0; i--) {

            for (int k = 5; k >= i; k--) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            for (int p = 1; p < i; p++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }

    }
}
