import java.util.*;

public class Main{

    public static void main(String[] args) {

        //Kontroll, kas leiab a tähed üles
        String s = "aabbccaaddeeaaffggaa";
        int counta = s.length()-s.replaceAll("a","").length();
        System.out.println("'A' tähte leidub kontrollis: " + counta);
        System.out.println("\n");

        //Pere tähtede leitavus
        String a = "pere";
        Sona uusSona= new Sona(a);

        System.out.println("Sõna 'pere'");
        System.out.println(uusSona.T2heEsinemiseArv('p'));
        System.out.println(uusSona.T2heEsinemiseArv('e'));
        System.out.println(uusSona.T2heEsinemiseArv('r'));
        System.out.println("\n");
        
        //Suvaline testitav lause masiivina
        String l = "Perekonda kuuluvad ka loomad";
        Lause uusLause = new Lause(l);

        System.out.println(uusLause.T2heEsinemiseArv('p'));
        System.out.println(uusLause.T2heEsinemiseArv('e'));
        System.out.println(uusLause.T2heEsinemiseArv('o'));
        System.out.println(uusLause.T2heEsinemiseArv('a'));
        System.out.println(uusLause.T2heEsinemiseArv('u'));

        System.out.println(uusLause.MituSonaOn());
        System.out.println(Arrays.toString(uusLause.SonadeMasiivid()));
        System.out.println("\n");

        //Uus suvaline testitav lause, kus leiab iga sõna a tähe esinemise
        //String l2 = "Suvaline testitav lause";
        String l2 = "Selle lause koostan väga pika, et programm saab rohkelt tööd teha ning anda mulle soovitud tulemuse isegi siis, kui lause on väga pikk ja a tähtede rohke";
        Lause uusLause2 = new Lause(l2);

        System.out.println(uusLause2.IgasSonasEraldi('a'));

    }
}
