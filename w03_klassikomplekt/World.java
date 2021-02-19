import java.util.ArrayList;

public class World {
    private int width;
    private int height;

    

    ///private GameCharacter gameCharacter;

    private ArrayList<GameCharacter> characters;

    //konstrukotr laseb luua maailma
    public World(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void addCharacter(ArrayList<GameCharacter> c){
        this.characters = c;
    }


    //render kutsub midagi välja, kui mängus on vaja seda kutsuda
    public void render(){
        char symbol; //karakter, määrab koordinaadi kohta


        for (int y = 0; y <= height; y++){
            for (int x = 0; x <= width; x++){
                if (y == 0 || y == height){
                    symbol = '-';
                } else if (x == 0 || x == width){
                    symbol = '|';
                } else {
                    symbol = ' ';
                }

                for (GameCharacter c : characters){
                    if (x == c.x && y == c.y && c.isVisible){
                        symbol = c.getSymbol();
                    }
                }

                //if (gameCharacter.x == x && gameCharacter.y == y){
                //    symbol = 'C';
                //}
                    

                System.out.print(symbol);
            }
            System.out.println("");
        }
    }
}
