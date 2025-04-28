package DataStructure;

import java.util.HashMap;
import java.util.Map;

public class Maps_ShoppingCart {
    public static void main(String[] args) {
        Map<String, Integer> cart = new HashMap<>();

        cart.put("Elma", 4);
        cart.put("Banana", 2);
        cart.put("Strawbery", 5);
        cart.put("Cucumber", 2);

        for (String product : cart.keySet()){
            System.out.println(product + " - " + cart.get(product) + " adet");
        }
    }
}
