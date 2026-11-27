import java.util.ArrayList;
import java.util.List;

public class ListsHomeWork {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(List.of("Яблоко", "Банан", "Груша", "Лимон", "Арбуз"));
        for(int i = 0; i < fruits.size(); i++) {
            System.out.println((i+1) +". " + fruits.get(i));
        }
    }
}

