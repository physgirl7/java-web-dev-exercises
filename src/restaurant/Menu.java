package restaurant;

import java.util.Date;
import java.util.ArrayList;

public class Menu {

    private Date dateUpdated;

    private ArrayList<MenuItem> items = new ArrayList<>();

    public Menu(Date dateUpdated, ArrayList<MenuItem> items){
        this.dateUpdated = dateUpdated;
        this.items = items;
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
