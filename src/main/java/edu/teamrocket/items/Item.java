package edu.teamrocket.items;

public class Item implements Product{

    private final String name;
    private final Double price;
    private String extra;

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Item(String name, Double price, String extra) {
        super();
        this.name = name;
        this.price = price;
        this.extra = extra;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public Double price() {
        return this.price;
    }

    @Override
    public String extra() {
        return this.extra;
    }

    @Override
    public Boolean isRegular() {
        return this.extra().isEmpty();
    }

    @Override
    public String toString() {
        return """
                %s....%f$
                %s....%f$
                %s....%f$
                %s....%f$
                %s....%f$
                """;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Item item) {
            return this.name.equals(item.name());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name().hashCode();
    }    
}
