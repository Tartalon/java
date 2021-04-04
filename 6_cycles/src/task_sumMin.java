public class task_sumMin {
//    Дано два числа A и B (A<B) выведите суму всех чисел,
//    расположенных между данными числами на экран.
//    Дано два числа A и B (A<B) выведите все нечетные значения,
//    расположенные между данными числами.

    public static void main(String[] args) {

        int a = 2;
        int b = 14;
        int sum = 0;

        for (int i = a + 1; i < b; i++) {
            sum += i;
        }

        System.out.println(sum);

        for (int i = a + 1; i < b; i++) {
            if (!(i % 2 == 0)) {
                System.out.println(i);
            }
        }
    }
}
