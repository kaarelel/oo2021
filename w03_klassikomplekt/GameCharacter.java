public class GameCharacter {
    public int x;
    public int y;
    public String name;
    private char symbol;
    public boolean isVisible = true;

    //KODUTÖÖ: tee kott mängijale. Laual on nt X ja mängija
    //liigub selle peale ja korjab selle üles 
    //hiljem saab selle maha panna kuhugi
    //limiteeritud

    //private String secret = "my secret";

    private Direction direction;

    private GameCharacterType gameCharacterType;

    //private String characterType = "";

    public GameCharacter(String name, int x, int y, char symbol, GameCharacterType gameCharacterType){
       
        this.name = name;
        this.gameCharacterType = gameCharacterType;
        this.direction = Direction.RIGHT;
        this.symbol = symbol;

        this.x = x;
        this.y = y;
    }

    public char getSymbol(){
        return symbol;
    }

    public void setDirection(Direction d){
        this.direction = d;
        move();
    }

    public void move(){
        switch(this.direction){
            case UP:
                this.y--;
                break;
            case RIGHT:
                this.x++;
                break;
            case DOWN:
                this.y++;
                break;
            case LEFT:
                this.x--;
                break;
            default:
                break;

        }
    }

    @Override
    public String toString(){
        return "My name is " + name + " and x:" + x + " and y:" + y;
    }
}
