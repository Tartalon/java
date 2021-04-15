package polimorf_bird;

public class Main {
    public static void main(String[] args) {
        Bird s = new Strauss();   // UpCast
        Bird p = new Penguin();

        Bird [] arr = {s, p};
        for (Bird temp : arr) {
            temp.move();
        }
    }
}
