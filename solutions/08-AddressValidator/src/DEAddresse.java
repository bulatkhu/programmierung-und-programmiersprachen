public class DEAddresse implements AddressValidator {
    String addresse, plz, bundesland;

    public DEAddresse(String addresse, String plz, String bundesland) {
        this.addresse = addresse;
        this.plz = plz;
        this.bundesland = bundesland;
    }

    @Override
    public boolean istGueltig() {
        if (addresse.length() < 10)
            return false;
        if(plz.length() != 5)
            return false;
        if(!(bundesland.length() == 2 || bundesland.length() == 3))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "DEAddresse{" +
                "addresse='" + addresse + '\'' +
                ", plz='" + plz + '\'' +
                ", bundesland='" + bundesland + '\'' +
                '}';
    }
}
