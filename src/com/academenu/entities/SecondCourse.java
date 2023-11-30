package com.academenu.entities;

public final class SecondCourse extends MenuItem {
    private boolean isFish;

    public SecondCourse(String name, double price, boolean isFish) {
        super(name, price);
        this.isFish = isFish;
    }

    public boolean isFish() {
        return isFish;
    }

    @Override
    public void printInformation() {
        System.out.println("Second Course: " + getName() + ", Pezzo: €" + getPrice() + ", E' pesce: " + isFish);
    }
}