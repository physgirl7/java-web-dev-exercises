package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;

public class Restaurant {
    public static void main(String[] args) {
        ArrayList<String> dairyAndGluten = new ArrayList<>();
        dairyAndGluten.add("dairy");
        dairyAndGluten.add("gluten");

        ArrayList<String> noAllergens = new ArrayList<>();
        noAllergens.add("none");

        ArrayList<MenuItem> list = new ArrayList<>();

        Menu newMenu = new Menu(list);

        newMenu.addMenuItem(9.00, "Warm chocolate chip cookie over ice cream",
                "Dessert", false, "Cookies and Cream", false,
                false, dairyAndGluten, 0, "None");
        newMenu.addMenuItem(12.85, "Pasta with chicken in a garlic cream sauce",
                "Main Course", true, "Pasta Carbonara", true,
                false, dairyAndGluten,0,"Chicken");
        newMenu.addMenuItem(35.00, "Steak grilled to perfection", "Main Course",
                false, "Filet Mignon", true, false, noAllergens,
                0,"Beef");
        newMenu.addMenuItem(8.50,"Gooey filled chocolate flourless cake", "Dessert",
                true, "Chocolate Lava Cake", true,false, noAllergens,
                0, "None");

        //Checking to print the whole menu
        newMenu.printMenuAll();

        //Check to try to add a menu item that already exists
        newMenu.addMenuItem(8.50,"Gooey filled chocolate flourless cake", "Dessert",
                true, "Chocolate Lava Cake", true,false, noAllergens,
                0, "None");

        //Check to print one menu item
        newMenu.printMenuItem("Cookies and Cream");

        //Check to print when the menu was last updated
        newMenu.menuLastDateUpdated();

        //Check to remove a menu item and reprint the entire menu with it removed
        newMenu.removeMenuItem("Chocolate Lava Cake");
        newMenu.printMenuAll();

        //Check to see if a menu item is new
        newMenu.isItemNew("Cookies and Cream");

    }
}
