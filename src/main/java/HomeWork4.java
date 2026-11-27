import java.util.List;

public class HomeWork4 {
    static List<Double> prices = HomeWorkMath.prices;


    public static void main(String[] args) {
        double budget = 500.00;
        double totalPrice = 0;
        int count = 0;
        for (int i = 0; i < prices.size(); i++) {
            if (totalPrice + prices.get(i) > budget)
                break;
            totalPrice += prices.get(i);
            count++;

        }
        System.out.println("Куплено: " + count + " товара на сумму: " + totalPrice);
        System.out.println("Остаток бюджета: " + (budget - totalPrice));
        System.out.println("Не куплено: " + (prices.size() - count) + " товара");


    }
}
