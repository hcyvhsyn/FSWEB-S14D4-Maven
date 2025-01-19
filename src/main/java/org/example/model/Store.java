package org.example.model;


public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[]{
                new Chocolate("Milk Chocolate", 5, "White Chocolate"),
                new Coke("Coca-Cola", 2, "Made in USA"),
                new Bread("Whole Wheat Bread", 3, "Made in Trabzon")
        };


        listProducts(products);
    }


    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}