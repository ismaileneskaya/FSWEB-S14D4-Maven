package org.example.model;

public class Coke extends ProductForSale{

    private boolean hasSugar;
    private double size;



    public Coke(String type, String description, int price) {
        super(type, price,description);
    }

    public Coke(String type, String description, int price, boolean hasSugar, double size) {
        super(type, price,description);
        this.hasSugar = hasSugar;
        this.size = size;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString()+this);
    }

    @Override
    public String toString() {
        return "Coke{" +
                "hasSugar=" + hasSugar +
                ", size=" + size +
                '}';
    }
}
