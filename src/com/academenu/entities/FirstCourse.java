package com.academenu.entities;

public final class FirstCourse extends MenuItem {
    private boolean glutenFree;

    public FirstCourse(String name, double price, boolean glutenFree) {
        super(name, price);
        this.glutenFree = glutenFree;
    }

    private boolean isGlutenFree() {
        return glutenFree;
    }

    // si puo settare gluten free solo durante la costruzione dell'oggetto perche ovviamente gli altri di default non lo sono
    public static FirstCourse createGlutenFreeFirstCourse(String name, double price) {
        return new FirstCourse(name, price, true);
    }

    @Override
    public void printInformation() {
        System.out.println("First Course: " + getName() + ", Pezzo: €" + getPrice() + ", Gluten Free: " + glutenFree);
    }
}