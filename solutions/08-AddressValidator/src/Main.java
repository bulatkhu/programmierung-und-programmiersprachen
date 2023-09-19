public class Main {
    public static void main(String[] args) {
        AddressValidator[] addressen = {
                new DEAddresse("Universitätsstraße 150", "44801", "NRW"),
                new DEAddresse("Universitätsstraße 100", "448015", "NRW"),
                new USAddressAdapter("1600 Pennsylvania Ave NW, Washington", "20500", "DC"),
                new USAddressAdapter("1600 Pennsylvania Ave NW, Washington", "20500", "NRW")
        };
        for (AddressValidator ad :
                addressen) {
            if(!ad.istGueltig()) {
                System.out.println("Addresse nicht gültig! " + ad.toString());
            }
        }
    }
}