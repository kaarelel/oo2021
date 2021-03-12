import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeomeetKesk {
    
    //1.
    //Kahe arvu ruutjuure arvutus


    public static double RuutJ (double arv1, double arv2){
        return (double) Math.round(Math.sqrt(arv1*arv2) * 10000.0D) / 10000.0D;
    }


    //2.
    //Sisestatud arvude ruutjuur
    

    public static double JuurListist (List<Double> arvud){
        int suurus = arvud.size();
        double korrutis = 1;

        for(int i = 0; i < suurus; i++){
            korrutis = korrutis * arvud.get(i);
        }

        return (double) Math.round(Math.pow(korrutis, 1.0/suurus) * 10000.0D) / 10000.0D;
    }


    //3.
    //Koefitsendi palga arvutus

    public static List<Double> Koefarvutus (List<Double> koefPalk){
        int pikkus = koefPalk.size();
        //arvuta uus palgaNR, kui korrutada koefiga
        for (int i = 1; i < pikkus; i++){
            koefPalk.set(i, (double)Math.round(koefPalk.get(i) * koefPalk.get(i-1) * 100.0D) / 100.0D);
        }
        return koefPalk;
    }


    //Geomeetriline keskmine palk

    public static List<Double> GeomeetKeskPalk(List<Double> koefPalk){
        int pikkus = koefPalk.size();
        List<Double> geomeetPalk = new ArrayList<Double>();
        for (int i = 1; i < pikkus; i++){
            geomeetPalk.add(koefPalk.get(i));
        }
        double geomeetKoef = JuurListist(geomeetPalk);
        geomeetPalk.add(0, koefPalk.get(0));
        for (int i = 1; i < pikkus; i++){
            geomeetPalk.set(i, (double)Math.round(geomeetKoef * geomeetPalk.get(i-1) * 100.0D) / 100.0D);
        }
        return geomeetPalk;
    }

    //Loe andmed failist sisse

    public static List<Double> sisse() throws IOException{
        BufferedReader Koefsisse = new BufferedReader(new FileReader("koef.txt"));
        List<Double> koefPalk = new ArrayList<Double>();
        String rida = Koefsisse.readLine();
        while (rida != null){
            koefPalk.add(Double.parseDouble(rida));
            rida = Koefsisse.readLine();
        }
        Koefsisse.close();

        return koefPalk;
    }

    public static void main(String[] arg) throws IOException{

        //1. Kahe arvu ruutjuure leidmine
        System.out.println("Kahe arvu ruutjuur on:");
        System.out.println(RuutJ(4.0, 4.0));

        //2.Sisestatud arvude leidmine
        List<Double> arvud = new ArrayList<Double>();
        System.out.println("Sisesta arvud, et leida nende korrutis ja juur. Lõpetuseks vajuta suvalist tähte: ");
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextDouble()){
            arvud.add(scan.nextDouble());
        }
        System.out.println("Sisestatud arvude ruutjuur on: " + JuurListist(arvud));

        //3.Koefitsendid ja geomeetkeskmine
        List<Double> koefPalk = sisse();
        List<Double> geoKesk = GeomeetKeskPalk(koefPalk);
        List<Double> koefPalgaKalk = Koefarvutus(koefPalk);
        PrintWriter valjund = new PrintWriter(new FileWriter("KoefValja.txt"));
        int pikkus = geoKesk.size();
        valjund.println("Koef palk  |  GeoKesk palk");
        for(int i = 0; i < pikkus; i++){
            valjund.println(koefPalgaKalk.get(i) + "   |  " + geoKesk.get(i));
        }

        valjund.close();
    }

}
