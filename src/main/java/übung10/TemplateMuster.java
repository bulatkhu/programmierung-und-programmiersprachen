package übung10;

import lombok.Data;

import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.*;

// assisted by: https://chat.openai.com/share/528f57ea-a41c-4102-b64d-410d9678902d

public class TemplateMuster {
    public static void main(String[] args) {
        String cvsFile = "DAX-2019-2020.csv";
        String txtFile = "dowjones_2019_2020.txt";

        CSVHandler csvHandler = new CSVHandler("./src/main/java/übung10/" + cvsFile);
        TXTHandler txtHandler = new TXTHandler("./src/main/java/übung10/" + txtFile);

        try {
            System.out.println(cvsFile + " content: " + csvHandler.einlesen().toString());
            System.out.println(txtFile + " content: " + txtHandler.einlesen().toString());
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}

@Data
abstract class DatenHandler {
    protected String dateiPfad;

    public DatenHandler(String dateiPfad) {
        this.dateiPfad = dateiPfad;
    }

    public ArrayList<Aktienkurs> einlesen() throws Exception {
        validiereDateipfad();
        validiereDatentyp();
        return transformiereDaten();
    }

    public boolean validiereDateipfad() throws Exception {
        if (Files.exists(Paths.get(dateiPfad))) {
            return true;
        }
        ;
        throw new Exception("File doesn't exist");
    }

    abstract public ArrayList<Aktienkurs> transformiereDaten() throws Exception;

    abstract public boolean validiereDatentyp() throws Exception;
}

class CSVHandler extends DatenHandler {
    public CSVHandler(String dateiPfad) {
        super(dateiPfad);
    }

    public boolean validiereDatentyp() throws Exception {
        if (dateiPfad.endsWith(".csv")) {
            return true;
        }
        throw new Exception("File's extension is not supported");
    }

    public ArrayList<Aktienkurs> transformiereDaten() throws Exception {
        ArrayList<Aktienkurs> aktienkurses = new ArrayList<>();

        List<String> lines = Files.readAllLines(Paths.get(dateiPfad));
        var index = 0;
        for (String line : lines) {
            if (index != 0) {
                String[] data = line.split(",");
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-M-dd", Locale.ENGLISH);
                Date datum = formatter.parse(data[0]);
                double eroeffnungswert = Double.parseDouble(data[1]);
                double maximalwert = Double.parseDouble(data[2]);
                double minimalwert = Double.parseDouble(data[3]);
                double schlusswert = Double.parseDouble(data[4]);
                aktienkurses.add(new Aktienkurs(datum, eroeffnungswert, maximalwert, minimalwert, schlusswert));
            }
            index++;
        }

        return aktienkurses;
    }
}


class TXTHandler extends DatenHandler {
    public TXTHandler(String dateiPfad) {
        super(dateiPfad);
    }

    public boolean validiereDatentyp() throws Exception {
        if (dateiPfad.endsWith(".txt")) {
            return true;
        };
        throw new Exception("File's extension is not supported");
    }

    public ArrayList<Aktienkurs> transformiereDaten() throws Exception {
        ArrayList<Aktienkurs> aktienkurses = new ArrayList<>();

        List<String> lines = Files.readAllLines(Paths.get(dateiPfad));
        var index = 0;
        for (String line : lines) {
            if (index != 0) {
                String[] data = line.split("\\|");
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-M-dd", Locale.ENGLISH);
                Date datum = formatter.parse(data[0]);
                double eroeffnungswert = Double.parseDouble(data[1]);
                double schlusswert = Double.parseDouble(data[2]);
                double maximalwert = Double.parseDouble(data[3]);
                double minimalwert = Double.parseDouble(data[4]);
                aktienkurses.add(new Aktienkurs(datum, eroeffnungswert, maximalwert, minimalwert, schlusswert));
            }
            index++;
        }

        return aktienkurses;
    }
}

@Data
class Aktienkurs {
    public Date datum;
    public double eroeffnungswert;
    public double maximalwert;
    public double minimalwert;
    public double schlusswert;

    public Aktienkurs(Date datum, double eroeffnungswert, double maximalwert, double minimalwert, double schlusswert) {
        this.datum = datum;
        this.eroeffnungswert = eroeffnungswert;
        this.maximalwert = maximalwert;
        this.minimalwert = minimalwert;
        this.schlusswert = schlusswert;
    }
}