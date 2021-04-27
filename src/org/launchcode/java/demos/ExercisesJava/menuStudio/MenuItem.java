package org.launchcode.java.demos.ExercisesJava.menuStudio;

public class MenuItem {

    private String itemName;
    private String category;
    private String description;
    private double price;
    private int dateSet;
    private boolean isNew = true;

    public MenuItem(String itemName, String category, String description, double price, int dateSet, boolean isNew) {
        this.itemName = itemName;
        this.category = category;
        this.description = description;
        this.price = price;
        this.dateSet = dateSet;
        this.isNew = isNew;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDateSet() {
        return dateSet;
    }

    public void setDateSet(int dateSet) {
        this.dateSet = dateSet;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
