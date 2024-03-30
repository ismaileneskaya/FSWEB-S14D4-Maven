package org.example.model;

public class Bread extends ProductForSale{

    private String flourType;
    private String color;

    public Bread(String type, String description, int price, String flourType, String color) {
        super(type,price, description );
        this.flourType = flourType;
        this.color = color;
    }

    public Bread(String type, String description, int price) {
        super(type, price,description);
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString()+this);
    }

    @Override
    public String toString() {
        return "Bread{" +
                "flourType='" + flourType + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
