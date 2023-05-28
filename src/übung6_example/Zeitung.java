package übung6_example;

import lombok.Data;

import java.util.Date;

@Data
public class Zeitung {
    private Date datum;
    private String titel;

    public Zeitung(Date datum, String titel) {
        this.datum = datum;
        this.titel = titel;
    }
}
