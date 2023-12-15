package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<ArrayList<MenuItem>> items;

    public Menu() {
        this.lastUpdated = new Date();
        this.items = new ArrayList<ArrayList<MenuItem>>();
    }

    public void addItem(ArrayList<MenuItem> item){
        if(!items.contains(item)) {
        items.add(item);
        } else {
            System.out.println("that may be on the menu already");
        }
    }
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void deleteAndPrint(MenuItem food){
        this.items.remove(food);
    }

    public void setItems(ArrayList<ArrayList<MenuItem>> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<ArrayList<MenuItem>> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "lastUpdated=" + lastUpdated +
                ", items=" + items +
                '}';
    }
}


