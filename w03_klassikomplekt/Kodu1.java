import java.io.IOException;
import java.util.Scanner;

public class Kodu1 {
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        

        System.out.println("Sisesta lause: ");
		String lause = input.nextLine();

        System.out.println("Sisesta täht: ");
        char ch = (char) System.in.read();

        int chLeidmine = 0;

        for (int i = 0; i < lause.length(); i++){
            char c = lause.charAt(i);
            if (c == ch){
                chLeidmine++;
            }
        }
        System.out.println(chLeidmine);
    }
}
