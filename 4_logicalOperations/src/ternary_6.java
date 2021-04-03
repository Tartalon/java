public class ternary_6 {
    public static void main(String[] args) {

        double quantity = 10; // количество едениц товара
        double price = 100;
        double discount = 0.75;
        double cost;

        // Если купили 10 и больше единиц товара то скидка

        cost = quantity >= 10 ? quantity * price * discount : quantity * price;

        System.out.println("Общая стоимоть товара: " + cost + "$");
    }
}
