package com.academenu.entities;

public final class Dessert extends MenuItem {
    private boolean sugarFree;
    private int test;
    private boolean withHands;

    public boolean isWithHands() {
        return withHands;
    }

    public void setWithHands(boolean withHands) {
        this.withHands = withHands;
    }





    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }




    public Dessert(String name, double price, boolean sugarFree) {
        super(name, price);
        this.sugarFree = sugarFree;
    }

    public boolean isSugarFree() {
        return sugarFree;
    }

    @Override
    public void printInformation() {
        System.out.println("Dessert: " + getName() + ", Pezzo: €" + getPrice() + ", Sugar Free: " + sugarFree);
    }
}