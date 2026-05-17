package edu.teamrocket.order;

import java.util.ArrayList;
import java.util.List;

import edu.teamrocket.items.Item;

public class Order implements Comanda{

    private Double total = 0d;
    private List<Item> items = new ArrayList<>();

    public Order() {
    }

    @Override
    public void addItem(String name, double price) {
        items.add(new Item(name, total));
    }

    @Override
    public void addItem(String name, double price, String extra) {
        items.add(new Item(name, total, extra));
    }

    @Override
    public int size() {
        return this.items.size();
    }

    @Override
    public void updateTotal(Double extra) {
        this.total += extra;
    }

    @Override
    public Double getTotal() {
        return this.total;
    }

    @Override
    public List<Item> itemList() {
        return items.stream().toList();
    }

    @Override
    public void display() {
        System.out.println("--- ORDER ---");
        items.forEach(this::itemDisplay);
    }

    private void itemDisplay(Item item) {
        System.out.println(item.toString());
    }
}
