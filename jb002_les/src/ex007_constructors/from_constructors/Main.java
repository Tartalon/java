package ex007_constructors.from_constructors;

public class Main {
    public static void main(String[] args) {
        //пример создания объекта с разными параметрами
        Animal animalDefault = new Animal();
        Animal animalWithOneParameter = new Animal(12);
        Animal animalTwoParameters = new Animal(14, 50);

        //выводим на экран объекты
        System.out.println("Age: " + animalDefault.getAge() + "Height: " + animalDefault.getHeight());
        System.out.println("Age: " + animalWithOneParameter.getAge() + "Height: " + animalWithOneParameter.getHeight());
        System.out.println("Age: " + animalTwoParameters.getAge() + "Height: " + animalTwoParameters.getHeight());
    }

}
