package org.example.model;

public class Chocolate extends ProductForSale{


    private String color;
    private boolean hasSugar;

    public Chocolate(String type, String description, int price) {
        super(type, price,description);
    }
    public Chocolate(String type, String description, int price, String color, boolean hasSugar) {
        super(type, price,description);
        this.color=color;
        this.hasSugar=hasSugar;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString()+this);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "color='" + color + '\'' +
                ", hasSugar=" + hasSugar +
                '}';
    }
}
