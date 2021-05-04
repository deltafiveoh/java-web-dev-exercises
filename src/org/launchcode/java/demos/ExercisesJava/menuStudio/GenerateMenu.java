package org.launchcode.java.demos.ExercisesJava.menuStudio;

import java.util.ArrayList;

public class GenerateMenu {
    public static void main(String[] args) {
        ArrayList<MenuItem> menuItemList = new ArrayList<>();

        // initial static menu that always exists
        String[] names = {"Steak", "Chicken", "Minestrone", "Sandwich"};
        String[] categories = {"Meat", "Meat", "Soup", "Bread"};
        String[] descriptions = {"Steak and potato cooked to order", "Chicken and rice with beans", "Vegetable based soup", "Ham and Cheese sandwich"};
        double[] prices = {20.00, 15.99, 10.00, 5.99};

        Menu restaurantMenu = new Menu(050321, menuItemList, false);

        // create and add items based on initial list
        for (int i = 0; i < 4; i++){
            MenuItem item = new MenuItem(names[i], categories[i], descriptions[i], prices[i], restaurantMenu.updateDate, false);
            menuItemList.add(item);
        }

        restaurantMenu.printFullMenu(menuItemList);

        MenuItem fish = new MenuItem("Fish", "Meat", "Fish cooked in lemon base with pasta", 15.99, 050421, true);
        MenuItem steak = new MenuItem("Steak", "Meat", "Steak and beans", 18.99, 050421, true);

        System.out.println("");
        restaurantMenu.addItem(fish, menuItemList);

        restaurantMenu.printFullMenu(menuItemList);
        System.out.println("");

        restaurantMenu.printSpecificItem("Steak", menuItemList);

        restaurantMenu.addItem(steak, menuItemList);
        restaurantMenu.printFullMenu(menuItemList);

        System.out.println("");
        restaurantMenu.removeItem(fish, menuItemList);
        restaurantMenu.printFullMenu(menuItemList);

    }
}
