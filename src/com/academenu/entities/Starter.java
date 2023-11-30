package com.academenu.entities;

public final class Starter extends MenuItem {
    private boolean needBread;

    public Starter(String name, double price, boolean needBread) {
        super(name, price);
        this.needBread = needBread;
    }

    public boolean isNeedBread() {
        return needBread;
    }

    @Override
    public void printInformation() {
        System.out.println("Starter: " + getName() + ", Pezzo: €" + getPrice() + ", Serve il pane: " + needBread);
    }
}