import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        File textfile = new File("dowjones_2019_2020.txt");
        TxtHandler txtHandler = new TxtHandler(textfile);

        File csvfile = new File("DAX-2019-2020.csv");
        CSVHandler csvHandler = new CSVHandler(csvfile);

        try {
            Aktienkurs txt = txtHandler.einlesen();
            System.out.println(txt);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            Aktienkurs csv = csvHandler.einlesen();
            System.out.println(csv);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}