import java.util.HashMap;


public class CharacterCount {
    public static void main(String[] args){
        
        String str = "Halleluja@@ and so on hh";
        int count ;
        char ch ; 
        HashMap<Character, Integer> charMapCount = new HashMap<Character, Integer>();

        for(int i = 0 ; i < str.length() ; i++){
            ch = str.charAt(i);
            if(charMapCount.containsKey(ch)){
                count = charMapCount.get(ch);
                count++;
                charMapCount.replace(ch, count);
            }else {
                charMapCount.put(ch, 1);
            }
        }
        for(Character key : charMapCount.keySet()){
            System.out.println(key + " = " + charMapCount.get(key));
        }
        
    }

}