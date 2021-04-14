package test_int;

// Порядок выполнения программы

public class A {
    {
        System.out.println("In block1");    // 2 (на уровне объекта)
    }

    static {
        System.out.println("In static block");   // 1 (на уровне класса, и отработает 1 раз)
    }

    A() {
        System.out.println("In constructor A");    // 4
    }

    {
        System.out.println("In block2");    // 3 (на уровне объекта)
    }

    public static void main(String[] args) {
        Aa a = new Aa();
        Aa a2 = new Aa();
    }
}
