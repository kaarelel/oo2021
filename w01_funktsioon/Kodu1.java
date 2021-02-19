import java.util.Scanner;
public class Kodu1 {

    myMath();
    
    public static void main(String[] Strings) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Sisesta kaal kilogrammides: ");
        double kaal = input.nextDouble();

        System.out.print("Sisesta pikkus sentimeetrites: ");
        double pikkus = input.nextDouble();

        double KMI = kaal * 100 * 100 / (pikkus * pikkus);

        if (KMI < 18.5) {

            System.out.println("Oled alakaalus!");

        } else if (KMI < 25) {

            System.out.println("Oled normaalkaalus!");

        } else if (KMI < 30){

            System.out.println("Oled ülekaalus!");

        } else {
            
            System.out.println("Konsulteeri arstiga!");
        } 

        System.out.print("Kehamassiindeks on: " +  Math.round(KMI) +"\n");
        
    }


    }
