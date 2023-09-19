import java.util.Date;

public class Tageskurs {
    public Date date;
    public Double eroeffungswert;
    public Double maximalwert;
    public Double minimalwert;
    public Double schlusswert;

    public Tageskurs(Date date, Double eroeffungswert, Double maximalwert, Double minimalwert, Double schlusswert) {
        this.date = date;
        this.eroeffungswert = eroeffungswert;
        this.maximalwert = maximalwert;
        this.minimalwert = minimalwert;
        this.schlusswert = schlusswert;
    }

    public String toString(){
        String text = date + ", " + eroeffungswert + ", " + maximalwert + ", "+ minimalwert + ", " + schlusswert + "; \n";
        return text;
    }
}
