public class Turtle implements AnimalBehaviour{



    @Override
    public void speak() {
        System.out.println("Mulle meeldib ujuda");
        
    }

    @Override
    public void eat() {
        System.out.println("ja ma söön kõike");
        
    }

    @Override
    public void sleep() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean beSneaky() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void lookAround() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean attack() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean defend() {
        // TODO Auto-generated method stub
        return true;
    }
    
}
