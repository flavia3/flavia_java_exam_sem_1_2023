package Model_1;

public class MenuItem {
    private String foodItems;
    private int price;
    private int ratings;
    public MenuItem(String foodItems,int price,int ratings){
        this.foodItems = foodItems;
        this.price = price;
        this.ratings = ratings;
    }
//using getters and setters
    public void setFoodItems(String foodItems) {
        this.foodItems = foodItems;
    }

    public String getFoodItems() {
        return foodItems;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public int getRatings() {
        return ratings;
    }
}
