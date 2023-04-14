package org.launchcode.java.studios.restaurant;


import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private String name;
    private boolean isAvailable;
    private boolean isVegan;
    private Date dateAdded;
    private ArrayList<String> allergens;
    private int spiceLevel;
    private String proteinType;

    public MenuItem(double price, String description, String category, boolean isNew, String name, boolean isAvailable,
                    boolean isVegan, ArrayList<String> allergens, int spiceLevel, String proteinType){
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
        this.name = name;
        this.isAvailable = isAvailable;
        this.isVegan = isVegan;
        this.dateAdded = new Date();
        this.allergens = allergens;
        this.spiceLevel = spiceLevel;
        this.proteinType = proteinType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
//        return Objects.equals(description, menuItem.description) && Objects.equals(category, menuItem.category) && name.equals(menuItem.name);
        return name.equals(menuItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, category, name);
    }

    public double getPrice(){
        return price;
    }
    public String getDescription(){
        return description;
    }
    public String getCategory(){
        return category;
    }
    public boolean getIsNew(){
        return isNew;
    }
    public String getName(){
        return name;
    }
    public boolean getIsAvailable(){
        return isAvailable;
    }
    public boolean getIsVegan(){
        return isVegan;
    }
    public Date getDateAdded(){
        return dateAdded;
    }
    public ArrayList<String> getAllergens(){
        return allergens;
    }
    public int getSpiceLevel(){
        return spiceLevel;
    }
    public String getProteinType(){
        return proteinType;
    }

    private void setPrice(double aPrice){
        this.price = aPrice;
    }
    private void setDescription(String aDescription){
        this.description = aDescription;
    }
    private void setCategory(String aCategory){
        this.category=aCategory;
    }
    private void setIsNew(boolean aIsNew){
        this.isNew = aIsNew;
    }
    private void setName(String aName){
        this.name = aName;
    }
    private void setIsAvailable(boolean aIsAvailable){
        this.isAvailable= aIsAvailable;
    }
    private void setIsVegan(boolean aIsVegan){
        this.isVegan = aIsVegan;
    }
    private void setDateAdded(Date aDateAdded){
        this.dateAdded=aDateAdded;
    }
    private void setAllergens(ArrayList<String> aAllergens){
        this.allergens=aAllergens;
    }
    private void setSpiceLevel(int aSpiceLevel){
        this.spiceLevel=aSpiceLevel;
    }
    private void setProteinType(String aProteinType){
        this.proteinType = aProteinType;
    }
}
