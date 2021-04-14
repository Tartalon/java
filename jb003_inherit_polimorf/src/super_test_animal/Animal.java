package super_test_animal;

public class Animal {
    private int weight;
    private String brade;

    Animal (int weight, String brade) {
        this.weight = weight;
        this.brade = brade;
    }
    Animal(){}

    public String getBrade() {
        return brade;
    }

    public int getWeight() {
        return weight;
    }
}
