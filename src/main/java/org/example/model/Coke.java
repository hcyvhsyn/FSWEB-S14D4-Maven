package org.example.model;

public class Coke extends ProductForSale {
    private boolean isImported;

    public Coke(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("is this product imported?" + isImported );

    }
}
