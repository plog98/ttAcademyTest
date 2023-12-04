package com.academenu.entities;

public final class Dessert extends MenuItem {
    private boolean sugarFree;

    private boolean withHands;
    private boolean withFruit;

    public boolean isWithFruit() {
        return withFruit;
    }

    public void setWithFruit(boolean withFruit) {
        this.withFruit = withFruit;
    }

    public boolean isWithHands() {
        return withHands;
    }

    public void setWithHands(boolean withHands) {
        this.withHands = withHands;
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