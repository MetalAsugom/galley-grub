package edu.teamrocket.items;

import java.util.HashMap;
import java.util.Map;

public class ItemFactory {
    private static Map<String, Item> itemMap = new HashMap<>();

    public ItemFactory() {
    }

    public static Item getItem(String item, double price) {
        itemMap.putIfAbsent(item, new Item(item, price));
        return itemMap.get(item);
    }

    public static Item getItem(String item, double price, String extra) {
        itemMap.putIfAbsent(item + extra, new Item(item, price, extra));
        return itemMap.get(item + extra);
    }
    
    public static int size() {
        return itemMap.size();
    }

    public static void clear() {
        itemMap.clear();
    }
}
