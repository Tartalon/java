public class tascs_DeMorganComparison {
//    Используя теорему Де Моргана,
//    преобразуйте исходное выражение A | B, в эквивалентное выражение

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean c = !(!a & !b);
    }
}
