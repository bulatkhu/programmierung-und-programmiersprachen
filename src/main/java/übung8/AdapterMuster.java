package übung8;

public class AdapterMuster {
    public static void main(String[] args) {
        AddressValidator validator = new DEAdresse();
        boolean valid = false;
        valid = validator.istGueltig("Universitätsstr. 150", "44801", "NRW");
        System.out.println(valid);
        valid = validator.istGueltig("Universitätsstr. 150", "44801", "NW");
        System.out.println(valid);
        validator = new USAddressAdapter();
        valid = validator.istGueltig("1600 Pennsylvania Ave NW, Washington", "20500", "DC");
        System.out.println(valid);
    }
}

class USAddress {
    public boolean isValidUSAddress(String address, String zip, String state) {
        if (address.length() < 10)
            return false;
        if (zip.length() < 5)
            return false;
        if (zip.length() > 10)
            return false;
        if (state.length() != 2)
            return false;
        return true;
    }
}


interface AddressValidator {
    public boolean istGueltig(String adresse, String plz, String bundesland);
}

class USAddressAdapter extends USAddress implements AddressValidator {
    @Override
    public boolean istGueltig(String adresse, String plz, String bundesland) {
        return isValidUSAddress(adresse, plz, bundesland);
    }
}

class DEAdresse implements AddressValidator {
    @Override
    public boolean istGueltig(String adresse, String plz, String bundesland) {
        // some validation logic here
        return true;
    }
}