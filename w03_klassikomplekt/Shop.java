import java.util.ArrayList;

public class Shop {

    private String item_name;
    private int item_price;

    public void setName(String name){
        this.item_name = name;
    }
    public String getName(){
        return this.item_name;
    }
    public void setPrice(int price){
        this.item_price = price;
    }
    public int getPrice(){
        return this.item_price;
    }

    public void addNewItem(Shop s){
        this.item_name = s.item_name;
        this.item_price = s.item_price; 

    }
    public void displayItems(ArrayList<Shop> arr){
        for (Shop shop : arr){
            System.out.println("Your bag contains: ");
            System.out.println("Item " + shop.item_name + "with price of " + shop.item_price);
        }
    }
}
