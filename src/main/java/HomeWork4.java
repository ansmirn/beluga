import java.util.ArrayList;
import java.util.List;

public class HomeWork4 {
    static List<Double> prices = new ArrayList<>(List.of
            (12.2, 666.12, 122.23, 55.00, 990.99));

    public static void main(String[] args) {
        double budget = 9500.00;
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
