package ex004_constructors;

public class DerivedClass extends BaseClass {
    public int derivedField;

    public DerivedClass() {
    }

    // пользовательский конструктор
    // вызывается пользовательский конструктор базового класса,
    // при этом не нужно присваивать значения унаследованим членам
    // в конструкторе произвольного класса.

    public DerivedClass (int number1, int number2) {
        super(number1);
        derivedField = number2;
    }
}
