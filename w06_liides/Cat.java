public class Cat implements AnimalBehaviour {

    

    @Override
    public void speak() {
        System.out.println("Ma söön kala");
    }

    @Override
    public void eat() {
        System.out.println("nurr, kui hea");
        
    }

    @Override
    public void sleep() {
        
        
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
        return true;
    }

    @Override
    public boolean defend() {
        // TODO Auto-generated method stub
        return false;
    }
    

}
