package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products =new ProductForSale[5];
        products[0] = new Chocolate("sweet","ch desc",134,"white",true );
        products[1]= new Bread("Bakery","br desc",135,"black","white");
        products[2] = new Coke("Drinks","soğuk içiniz",16,true,2.5);
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {

        for(ProductForSale product:products){
            if(product!= null){
                product.showDetails();
            }
        }
    }
    
}