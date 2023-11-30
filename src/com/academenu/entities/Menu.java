package com.academenu.entities;

public class Menu {
    private final MenuItem[] starters;
    private final MenuItem[] firstCourses;
    private final MenuItem[] secondCourses;
    private final MenuItem[] desserts;

    public Menu() {
        this.starters = new MenuItem[10];
        this.firstCourses = new MenuItem[10];
        this.secondCourses = new MenuItem[10];
        this.desserts = new MenuItem[10];
    }
    public String getStarters() {
        return getNames(starters);
    }

    public String getFirstCourses() {
        return getNames(firstCourses);
    }

    public String getSecondCourses() {
        return getNames(secondCourses);
    }

    public String getDesserts() {
        return getNames(desserts);
    }


    //METODI


    private String getNames(MenuItem[] items) {
        StringBuilder names = new StringBuilder();
        for (MenuItem item : items) {
            names.append(item.getName()).append(", ");
        }
        return names.toString();
    }


    //Aggiungere all'array gli elementi


}