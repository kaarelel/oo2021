public class Main {
    public static void main(String args[]){
        Player p = new Player();
         
         p.addItemToInv("Bacon");
         p.printInv();
         p.removeItemFromInv("Bacon");
         p.printInv();
       }
}
