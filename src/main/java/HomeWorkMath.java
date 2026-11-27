import java.util.ArrayList;
import java.util.List;

public class HomeWorkMath {
    static List<Double> prices = new ArrayList<>(List.of(12.2, 666.12, 122.23, 55.00, 990.99));

    public static void main(String[] args) {
        double budget = 4113.85;
        double sum = 0;
        for (double price : prices) {
            sum += price;
        }
        System.out.println("Сумма товаров в корзине: " + sum);

        if (budget >= sum) {
            System.out.println("Денег достаточно. Остаток бюджета: " + (budget - sum));
        } else {
            System.out.println("Денег недостаточно. Не хватает: " + (sum - budget));
        }
    }
}
