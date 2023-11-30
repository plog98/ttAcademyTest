package com.academenu.execution;
import com.academenu.entities.*;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        MenuItem item1 = new Starter("Patatine fritte", 5.99, false);
        MenuItem item2 = FirstCourse.createGlutenFreeFirstCourse("Pasta alla Carbonara", 12.00);
        MenuItem item3 = new SecondCourse("Polpettine in agrodolce", 22.00, false);
        MenuItem item4 = new Dessert("Cheesecake", 7.00, false);


    }
}
