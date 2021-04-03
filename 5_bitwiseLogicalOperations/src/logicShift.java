public class logicShift {
    public static void main(String[] args) {
        byte operand = 0b0000001;
        System.out.println("Число до сдвига " + operand);

        // сдвиг влево
        operand = (byte)(operand << 2);
        System.out.println("Число после сдвига " + operand);

        // Сдвиг вправо
        operand = (byte)(operand >> 1);
        System.out.println("Число после сдвига вправо " + operand);

        // беззнаковый сдвиг
        int num = -1 >>> 24;
        System.out.println("Беззнаковый сдвиг на 24 " + num);
    }
}
