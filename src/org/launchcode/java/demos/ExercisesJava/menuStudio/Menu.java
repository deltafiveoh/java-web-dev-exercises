package org.launchcode.java.demos.ExercisesJava.menuStudio;

import java.util.ArrayList;

public class Menu {

    int updateDate;
    ArrayList<Menu> item = new ArrayList<>();
    boolean specialOffer;

    public Menu(int updateDate, ArrayList<Menu> item, boolean specialOffer) {
        this.updateDate = updateDate;
        this.item = item;
        this.specialOffer = specialOffer;
    }

    public int getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(int updateDate) {
        this.updateDate = updateDate;
    }

    public ArrayList<Menu> getItem() {
        return item;
    }

    public void setItem(ArrayList<Menu> item) {
        this.item = item;
    }

    public boolean isSpecialOffer() {
        return specialOffer;
    }

    public void setSpecialOffer(boolean specialOffer) {
        this.specialOffer = specialOffer;
    }
}
