import javax.swing.text.html.HTML;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class TxtHandler extends DatenHandler{
    public TxtHandler(File file) {
        super(file);
    }

    @Override
    public boolean validiereDateityp() {
        if (file.getName().contains("txt")){
            return true;
        }
        return false;
    }

    @Override
    public Aktienkurs transfomiereDatei() throws FileNotFoundException {
        FileReader fileReader = new FileReader(file);
        Scanner scanner = new Scanner(fileReader);
        String header = scanner.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        ArrayList<Tageskurs> tageskurse = new ArrayList<>();

        while (scanner.hasNext()){
            String zeile = scanner.next();
            String[] werte = zeile.split("\\|");

            String datum_text = werte[0];
            Date date;
            try {
                date = dateFormat.parse(datum_text);
            }catch (ParseException exception){
                exception.printStackTrace();
                date = new Date(0);
            }

            double eroeffungswert = Double.parseDouble(werte[1]);
            double schlusswert = Double.parseDouble(werte[2]);
            double maxwert = Double.parseDouble(werte[3]);
            double minwert = Double.parseDouble(werte[4]);

            Tageskurs tageskurs = new Tageskurs(date, eroeffungswert, maxwert, minwert, schlusswert);
            tageskurse.add(tageskurs);
        }

        return new Aktienkurs(tageskurse);
    }
}
