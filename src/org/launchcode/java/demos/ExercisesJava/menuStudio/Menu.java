package org.launchcode.java.demos.ExercisesJava.menuStudio;

import java.util.ArrayList;
import java.util.Locale;

public class Menu {

    int updateDate;
    ArrayList<MenuItem> item = new ArrayList<>();
    boolean specialOffer;

    public Menu(int updateDate, ArrayList<MenuItem> item, boolean specialOffer) {
        this.updateDate = updateDate;
        this.item = item;
        this.specialOffer = specialOffer;
    }

    // tells you last date of update
    public int getUpdateDate() {
        return updateDate;
    }

    // sets new date of last update, not coded in yet
    public void setUpdateDate(int updateDate) {
        this.updateDate = updateDate;
    }

    public void setIsNew(){
        //code that would change isNew of each menu item based on items date vs the getUpdateDate results (assume isNew if < 2 weeks)
    }

    //does what it says
    public ArrayList<MenuItem> getItem() {
        return item;
    }

    //allows changing items
    public void setItem(ArrayList<MenuItem> item) {
        this.item = item;
    }

    // says if an item is on special offer, no variable yet
    public boolean isSpecialOffer() {
        return specialOffer;
    }

    // would set an item to special offer, no variable yet
    public void setSpecialOffer(boolean specialOffer) {
        this.specialOffer = specialOffer;
    }

    public void printFullMenu(ArrayList<MenuItem> y){
        System.out.println("The menu is: ");
        for (MenuItem i : y){
            System.out.println(i.toString());
        }
    }

    public void printSpecificItem(String x, ArrayList<MenuItem> y){
        System.out.println("The details for that menu item are:");
        for (MenuItem i : y){
            if (i.getItemName() == x){
                System.out.println(i.toString());
            }
        }
    }

    public void addItem(MenuItem x, ArrayList<MenuItem> y){
        int counter = 0;
        for (MenuItem z : y){
            if (z.getItemName() == x.getItemName()){
                System.out.println("That item is already on the menu");
                break;
            } else {
                counter++;
            }
        }
        if (counter == y.size()){
            y.add(x);
        }
    }

    public void removeItem(MenuItem x, ArrayList<MenuItem> y){
        y.remove(x);
    }

}
