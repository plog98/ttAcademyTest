package com.academenu.entities;

public class Menu {
    private MenuItem[] starters = new Starter[10];
    private MenuItem[] firstCourses = new FirstCourse[10];
    private MenuItem[] secondCourses = new SecondCourse[10];
    private MenuItem[] desserts = new Dessert[10];

    private MenuItem[] drinks = new Drink[10];

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
