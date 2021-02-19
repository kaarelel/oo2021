public class Second {

    public static void main(String[] args){
        System.out.println(myName());
        System.out.println(add(5, 10));
        System.out.println(fullName("Kaarel", "Eelmäe"));
        System.out.println(checkEqual(5, 5));
        System.out.println(notEqual(4, 4));

        myMath();
    }

    public static String myName(){
        return "Kaarel";
    }
    
    public static int add(int number1, int number2){
        return number1 + number2;
    }

    public static String fullName(String firstName, String lastname){
        return firstName + " " + lastname + " !";
    }

    public static boolean checkEqual(int number1, number2){
        return number1 == number2;
    }

    public static boolean checkEqual(int number1, number2){
        return number1 != number2;
    }

    public static void myMath(){
        System.out.println(Math.pow(5, 2));
    }
}
//function add(number1, number)