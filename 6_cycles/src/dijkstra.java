import java.util.Scanner;

public class dijkstra {
    //Цикл Дейкстры. При каждой итерации вычисление охраняемых условий.
    //Если истенны несколько охраняемых условий то выполнится лишь одна охраняемая команда.
    // Цикд Дейкстры с одним охраняющим условием и одной охраняющей командой - обычный цикл
    //с предусловием (wile)

    public static void main(String[] args) {
        char character;
        Scanner in = new Scanner(System.in);

        for (; ;) {
            character = in.next().charAt(0);

            switch (character) {
                case 'l': // 'l' - охраняемое условие
                    // охраняемая команда
                    System.out.println("Go left");
                    continue;

                case 'r':
                    System.out.println("Go right");
                    continue;
            }
            break; //Прирывание цикла
        }
    }
}
