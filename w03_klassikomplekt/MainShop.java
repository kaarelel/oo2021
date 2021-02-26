import java.util.ArrayList;
import java.util.Scanner;


public class MainShop {
    public static void main(String[] args){
        //int opt;
        Scanner sc = new Scanner(System.in);
        ArrayList<Shop> shopList = new ArrayList<Shop>();
       
        Shop s = new Shop();

        System.out.println("Item name: ");
        sc = new Scanner (System.in);
        sc.next();
        s.setName(sc.nextLine());
        System.out.println("Item price: ");
        s.setPrice(sc.nextInt());
        s.addNewItem(s);
        shopList.add(s);

        
        s.displayItems(shopList);
    }

}
