public class deMorgan {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // до теоремы деМоргана
        if (!a || !b)
            System.out.println("!A || !B = " + (!a || !b));
        else
            System.out.println("!A || !B = " + (!a || !b));

        //осле деМоргана
        if (!(a && b))
            System.out.println("!(A && B) = " + !(a && b));
        else
            System.out.println("!(A && B) = " + !(a && b));
    }
}
