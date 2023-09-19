package rub.de.propro.zeitung;

import java.util.Date;

public class Zeitung {
    private Date datum;
    private String titel;

    public Zeitung(Date datum, String titel) {
        this.datum = datum;
        this.titel = titel;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }
}
