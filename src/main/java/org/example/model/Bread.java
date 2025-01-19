package org.example.model;

public class Bread extends ProductForSale {
    private double weight;
    public Bread(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This product weight is" + weight );

    }
}
