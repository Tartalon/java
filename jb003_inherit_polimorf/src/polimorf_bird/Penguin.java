package polimorf_bird;

public class Penguin extends Bird{
    @Override   // Значит что метод будет переопределен от базового класса
    public void move() {
        System.out.println("swim");
    }
}
