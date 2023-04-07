package org.launchcode.java.studios.restaurant;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.ArrayList;

public class Menu {

    private Date dateUpdated;

    private ArrayList<MenuItem> items = new ArrayList<>();

    public Menu(ArrayList<MenuItem> items){
        this.dateUpdated = new Date();
        this.items = items;
    }

    public void addMenuItem(double price, String description, String category, boolean isNew,
                            String name, boolean isAvailable, boolean isVegan,
                            ArrayList<String> allergens, int spiceLevel, String proteinType) {
        MenuItem newMenuItem = new MenuItem(price, description, category, isNew, name,
                isAvailable, isVegan, allergens, spiceLevel, proteinType);
        boolean notNew = false;
        if(items.size()==0) {
            this.items.add(newMenuItem);
        } else {
            for (MenuItem item : items) {
                if (item.equals(newMenuItem)) {
                    System.out.println("This menu item --" + item.getName() + "-- already exists. It has not been added to the menu.");
                    notNew = true;
                }
            }
            if(!notNew) {
                this.items.add(newMenuItem);
                this.dateUpdated = new Date();
            }
        }
    }

    public void removeMenuItem (String name) {
        int index = -1;
        for (MenuItem item : items) {
            if (item.getName() == name) {
               index = items.indexOf(item);
            }
        }
        if(index >=0) {
            this.items.remove(index);
        }
        this.dateUpdated = new Date();
    }

    public void isItemNew(String name){
        int index = -1;
        for (MenuItem item : items) {
            if (item.getName() == name){
                index = items.indexOf(item);
            }
        }
        if(index >=0){
           if( items.get(index).getIsNew()){
               System.out.println(items.get(index).getName() +" is a new menu item.");
           } else{
               System.out.println(items.get(index).getName()+ " is not a new menu item.");
           }
        }
    }

    public void menuLastDateUpdated(){
        System.out.println("The menu was last updated on " + this.dateUpdated);
    }



    public void printMenuItem(String name) {
        for (MenuItem item : items) {
            if (item.getName() == name) {
                System.out.println("**********");
                System.out.print("** ");
                System.out.print(item.getName());
                System.out.println(" **");
                System.out.println("Price: $" + item.getPrice());
                System.out.println("Description: " + item.getDescription());
                System.out.println("Category: " + item.getCategory());
                System.out.println("New Menu Item: " + item.getIsNew());
                System.out.println("Available: " + item.getIsAvailable());
                System.out.println("Vegan: " + item.getIsVegan());
                System.out.println("Date Added: " + item.getDateAdded());
                System.out.println("Allergens: "+ item.getAllergens());
                System.out.println("Spice Level: " + item.getSpiceLevel());
                System.out.println("Protein Type: " + item.getProteinType());
                System.out.println("**********\n\n");

            }
        }
    }

    public void printMenuAll() {
        for (MenuItem item : items) {
                System.out.println("**********");
                System.out.print("** ");
                System.out.print(item.getName());
                System.out.println(" **");
                System.out.println("Price: $" + item.getPrice());
                System.out.println("Description: " + item.getDescription());
                System.out.println("Category: " + item.getCategory());
                System.out.println("New Menu Item: " + item.getIsNew());
                System.out.println("Available: " + item.getIsAvailable());
                System.out.println("Vegan: " + item.getIsVegan());
                System.out.println("Date Added: " + item.getDateAdded());
                System.out.println("Allergens: "+ item.getAllergens());
                System.out.println("Spice Level: " + item.getSpiceLevel());
                System.out.println("Protein Type: " + item.getProteinType());
                System.out.println("**********\n\n");
        }
    }



    public Date getDateUpdated(){
        return dateUpdated;
    }
    public ArrayList<MenuItem> getItems(){
        return items;
    }

    public void setDateUpdated(Date aNewDate){

        this.dateUpdated = aNewDate;
    }
    public void setItems(ArrayList<MenuItem> aNewList){
        this.items = aNewList;
    }

}

