public class Animal {

    public String type = "";
    public String name = "";
    public int age;
    public String breed;
    public double weight; 

    public void AnimalType(String animalType){
        type = animalType; 
    }

    public Animal(String name){
        this.name = name;
    }

    public void AnimalAge(int animalAge){
        age = animalAge;
    }

   public void AnimalBreed(String animalBreed){
       breed = animalBreed;

   }

   public void AnimalWeight(double animalWeight){
       weight = animalWeight;
   }

   public void printAnimal(){
       
       System.out.println("Tüüp: " + type);

       System.out.println("Nimi: " + name);

       System.out.println("Vanus: " + age);

       System.out.println("Tõug: " + breed);

       System.out.println("Kaal: " + weight + "kg");

   }
    
}
