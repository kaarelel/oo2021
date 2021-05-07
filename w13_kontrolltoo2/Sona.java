public class Sona implements Liides {

    //Loo realiseeriv klass sõna tarbeks. Koosta automaattestid töö kontrolliks näitamaks a, p ja e-tähtede arvu sõnas pere.

    String sona;
  
    public Sona(String sona){
    this.sona = sona;
    }
  
    public String T2heEsinemiseArv(char t2ht){
      int kordused = 0;
      for (int i = 0; i < sona.length(); i++){
  
        if (sona.charAt(i) == t2ht){
          kordused++;
        }
      }
      return "Tähte " + t2ht + " leidub: " + kordused;
    }
  }