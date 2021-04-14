package ex001_inheritance;

public class DerivedClass extends BaseClass {
    //Конструктор
    public DerivedClass() {
        //Изменяем все доступные поля унаследованные от базового класса.
        publicField = "DerivedClass.publicField";
        protectedField = "DerivedClass.protectedField";
    }
}
