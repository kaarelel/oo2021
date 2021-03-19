public class Car implements Vehicle{
    int gear;

    @Override
    public void run() {
        System.out.println("Audi käivitati ja auto töötab");
        
    }

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
        
    }

    @Override
    public void whatGear() {
        System.out.println("Praegu on " + gear + " käik sees");
        
        
    }
    
}
