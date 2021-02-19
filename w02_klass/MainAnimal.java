import java.util.ArrayList;

public class MainAnimal {
    public static void main(String[] args){
        
       
        AnimalBreed character1 = new AnimalBreed("Reks");


        System.out.println(
            character1.name + " " +
            character1.getBreed());

        character1.setBreed("Rotveiler");

        System.out.println(character1.getBreed());

        AnimalBreed character2 = new AnimalBreed("Donna");

        System.out.println(character1);
        System.out.println(character2);

        System.out.println(character1.getXY()[1]);
    }

    public static void animal(){

    Animal animal1 = new Animal();
    System.out.println(animal1.legs + " " + animal1.name);

    animal1.legs = 5;
    animal1.name = "Rex";

    System.out.println(animal1.legs + " " + animal1.name);

    Animal animal2 = new Animal("Beauty");

    System.out.println(animal2.name);
    animal2.legs = 10;

    System.err.println(animal1.legs + " " + animal2.legs);
    

    }

    public static void lists(){

     

    
    String[] stringArray = new String[5];
    int[] numberArray = new int[5];

    ArrayList<String> stringList = new ArrayList<>();

    numberArray[0] = 5;

    stringList.add(0, "Hello");
    stringList.add("Yellow");
    stringList.add(1, "Orange");

    for(String entry : stringList){
        System.out.println(entry);
     }

    System.out.println(stringList.get(1));
    }
}
