package org.example.model;

public abstract class ProductForSale {

    private String type;
    private int price;
    private String description;


    public ProductForSale(String type, int price,String description){
        this.type=type;
        this.description=description;
        this.price=price;
    }

    public String getType(){
        return type;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public int getSalesPrice(int quantity){
        return quantity*this.price;
    }
    public abstract void showDetails();


    @Override
    public String toString() {
        return "ProductForSale{" +
                "type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
