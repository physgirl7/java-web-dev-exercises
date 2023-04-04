package restaurant;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Date;

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
                    boolean isVegan, Date dateAdded, ArrayList<String> allergens, int spiceLevel, String proteinType){
     this.price = price;
     this.description = description;
     this.category = category;
     this.isNew = isNew;
     this.name = name;
     this.isAvailable = isAvailable;
     this.isVegan = isVegan;
     this.dateAdded = dateAdded;
     this.allergens = allergens;
     this.spiceLevel = spiceLevel;
     this.proteinType = proteinType;
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
    public boolean isVegan(){
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
    private void setname(String aName){
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
