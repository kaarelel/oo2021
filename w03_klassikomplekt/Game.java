import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int width = 20;
        int height = 10;

        World world = new World(width, height);
        GameCharacter player = new GameCharacter("Kaarel", 2, 3, 'C', GameCharacterType.RANGER);
        GameCharacter dummy = new GameCharacter("Dummy", 5, 6, 'D', GameCharacterType.WARRIOR);
        GameCharacter witch = new GameCharacter("Witch", 8, 9, '?', GameCharacterType.WIZARD);
        ArrayList<GameCharacter> characters = new ArrayList<>();
        characters.add(player);
        characters.add(dummy);
        characters.add(witch);

        world.addCharacter(characters);
        world.render();
        System.out.println(player);

        Scanner scanner = new Scanner(System.in);
        String input = "";

        while(!input.equals("end")){
            input = scanner.nextLine().toLowerCase();

            if (input.equals("")){
                player.move();
            } else if (input.equals("l")){
                player.setDirection(Direction.LEFT);
            } else if (input.equals("r")){
                player.setDirection(Direction.RIGHT);
            } else if (input.equals("u")){
                player.setDirection(Direction.UP);
            } else if (input.equals("d")){
                player.setDirection(Direction.DOWN);
            }
                
            // player == witch (x == y)teleport player teisekohta
            if (player.x == witch.x && player.y == witch.y){
                player.x = (int)(Math.random() * width - 1) + 1;
                player.y = (int)(Math.random() * height -1) + 1;

                //if (dummy.isVisible == true){
                 //   dummy.isVisible = false;
                //} else {
                //    dummy.isVisible = true;
                //}

                dummy.isVisible = dummy.isVisible ? false : true;
                //küsi, kas tõsi, tee false ja muuljuhul true
            }

           //if (player.x == dummy.x && player.y == dummy.y){
           //     player.x = (int)(Math.random() * width - 1) + 1;
           //     player.y = (int)(Math.random() * height -1) + 1;
           // }

        
            //player.move();
            world.render();
            System.out.println(player);
        }

    }
}
