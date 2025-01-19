package org.example.model;

public class Chocolate extends ProductForSale {
    private String contents;

    public Chocolate(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This product contents" + contents );

    }
}
