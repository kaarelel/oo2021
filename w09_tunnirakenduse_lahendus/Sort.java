import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Sort {
    public static void main(String[] args) throws IOException {

        PrintWriter writeFile = new PrintWriter(new FileWriter("tabel_sorteeritud.txt"));

        Files.readAllLines(Paths.get("tabel.txt"))
            .stream()
            .map(e -> e.split(","))
            .filter(e -> Integer.parseInt(e[1]) >= 3)
            .map(e -> "Inimese " + e[0] + " vanus on " + e[1] + " ja tema postiindeks on " + e[2])
            .forEach(e -> writeFile.println(e));
            writeFile.close();
    }
}