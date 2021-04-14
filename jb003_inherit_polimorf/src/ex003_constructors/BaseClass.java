package ex003_constructors;

public class BaseClass {
    public int baseNumber;

    // Конструктор по умолчанию
    public BaseClass () {
    }

    // Пользовательский конструктор
    public BaseClass (int baseNumber) {
        this.baseNumber = baseNumber;
    }
}
