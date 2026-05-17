package edu.teamrocket.items;

import java.util.Map;
import java.util.HashMap;
import java.util.stream.Stream;

public class RetailPrice {
    private static Map<String, Double> prices = new HashMap<String, Double>();

    public RetailPrice() {
    }
    
    public static void init_prices() {
        prices.put("cheese", 0.25);
        prices.put("sauce", 0.5);
        prices.put("medium", 0.25);
        prices.put("large", 0.5);
    }

    public static Double getPrice(String extra) {
        return prices.get(extra);
    }

    public static boolean contains(String extra) {
        return prices.containsKey(extra);
    }

    public static void display() {
        prices.forEach((k, v) -> System.out.println(prices.entrySet()));
    }
}
