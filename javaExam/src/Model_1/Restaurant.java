package Model_1;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String location;
    private ArrayList<MenuItem> menuItems;

    public Restaurant(){
        this.name = name;
        this.location = location;
        this.menuItems = new ArrayList<MenuItem>();
    }
//using getters and setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String getName(){
        return name;
    }
    public String getLocation(){
        return location;
    }
    public void addMenuItems(MenuItem menuItem){
        menuItems.add(menuItem);
    }
    public void removeMenuItems(MenuItem menuItem){
        menuItems.remove(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems(){
        return menuItems;
    }
}
