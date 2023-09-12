package übung6_example;

import java.util.Date;
import java.util.ArrayList;

public class ZeitungsVerlag {
    private final ArrayList<IAbonnent> abonnenten = new ArrayList<>();

    public void registriereBeobachter(IAbonnent abonnent) {
        if (!this.abonnenten.contains(abonnent))
            abonnenten.add(abonnent);
    }

    public void verteileZeitung(String titel) {
        Zeitung zeitung = new Zeitung(new Date(), titel);
        benachrichtigeBeobachter(zeitung);
    }

    public void entferneBeobachter(IAbonnent abonnent) {
        abonnenten.remove(abonnent);
    }

    public void benachrichtigeBeobachter(Zeitung zeitung) {
        for (IAbonnent abonnent : this.abonnenten) {
            abonnent.erhalteZeitung(zeitung);
        }
    }
}
