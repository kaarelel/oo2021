public class Lause implements Liides {

    String lause;

    public Lause (String lause) {
    this.lause = lause;
    }

    public String MituSonaOn() {
      int mitu = 0;
      String[] arrayOfStrings = this.lause.split(" ");
      if (this.lause != null) {
        mitu = arrayOfStrings.length;
      }
        
      return "Lauses on sõnu kokku: " + mitu;
    }

    public String[] SonadeMasiivid() {  
      String[] arrayOfStrings = this.lause.split(" ");  
      return arrayOfStrings;
    }

    public String IgasSonasEraldi(char a) {
      String[] arrayOfStrings = this.lause.split(" ");
      int kordusedkokku= 0;

      for (int i = 0; i < arrayOfStrings.length; i++) {
        int kordused = 0;
        for (int j = 0; j < arrayOfStrings[i].length(); j++) {
    
          if (arrayOfStrings[i].charAt(j) == a) {
            kordused++;
            kordusedkokku++;
          }
        }
        System.out.println("Tähte " + a + " leidub sõnas " + arrayOfStrings[i] + " " + kordused);
        
      }
      return "Kokku on selles lauses " + kordusedkokku + " 'a' tähte";
    }

    public String T2heEsinemiseArv(char t2ht) {
        int kordused = 0;
        for (int i = 0; i < this.lause.length(); i++) {
    
          if (this.lause.charAt(i) == t2ht) {
            kordused++;
          }
        }
        return "Tähte " + t2ht + " leidub lauses: " + kordused;
    }
    
}