import java.io.File;
import java.io.FileNotFoundException;

public abstract class DatenHandler {
    public File file;

    public DatenHandler(File file) {
        this.file = file;
    }

    public Aktienkurs einlesen() throws FileNotFoundException {
        if(!validiereDateipfad()){
            System.out.println("Datei " + file + " wird nicht gefunden.");
            return null;
        }
        if (!validiereDateityp()){
            System.out.println("Datei " + file + " hat den falschen Datentyp.");
            return null;
        }
        return transfomiereDatei();
    }

    public boolean validiereDateipfad(){
        return file.exists();
    }

    public abstract boolean validiereDateityp();
    public abstract Aktienkurs transfomiereDatei() throws FileNotFoundException;
}
