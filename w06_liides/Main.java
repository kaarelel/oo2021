public class Main {
    public static void main(String[] args) {

        EstonianID est = new EstonianID("50003230227");
        //FinnishID fin = new FinnishID("131052-308T");
        FinnishID fin = new FinnishID("230181-237J");
        


        //Est
        System.out.println("Eesti ID kood: ");
        System.out.println("Sugu: " + est.getGender());
        System.out.println("Sünniaasta: " + est.getFullYear());
        System.out.println("Sünnikuupäev: " + est.geDOB());
        System.out.println("Vanus: " + est.getAge());
        System.out.println("Sünni päev: " + est.getDay());
        System.out.println("Sünni kuu: " + est.getMonth());
        System.out.println("\n");

        //Fin
        System.out.println("Soome ID kood: ");
        System.out.println("Sugu: " + fin.getGender());
        System.out.println("Sünniaasta: " + fin.getFullYear());
        System.out.println("Sünnikuupäev: " + fin.geDOB());
        System.out.println("Vanus: " + fin.getAge());
        System.out.println("Sünni päev: " + fin.getDay());
        System.out.println("Sünni kuu: " + fin.getMonth());
        System.out.println("\n");

        //Turtle
        Turtle jack = new Turtle();
        System.out.println("Kilpkonn Jacki saladus: ");
        jack.speak();
        jack.eat();
        System.out.println("\n");

        //Cat
        Cat miku = new Cat();
        System.out.println("Kass Miku: ");
        miku.speak();
        miku.eat();
        System.out.println("\n");

        //Auto 
        Vehicle Audi = new Car();
        Audi.run();
        Audi.changeGear(1);
        Audi.whatGear();

        Audi.changeGear(2);
        Audi.whatGear();

        Audi.changeGear(3);
        Audi.whatGear();

        Audi.changeGear(4);
        Audi.whatGear();
    }
}
