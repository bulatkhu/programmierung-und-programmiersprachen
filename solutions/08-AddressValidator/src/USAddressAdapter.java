import us.postalservice.USAddress;

public class USAddressAdapter extends USAddress implements AddressValidator{

    String address, zip, state;

    public USAddressAdapter(String address, String zip, String state) {
        this.address = address;
        this.zip = zip;
        this.state = state;
    }

    @Override
    public boolean istGueltig() {
        return this.isValidUSAddress(address, zip, state);
    }

    @Override
    public String toString() {
        return "USAddressAdapter{" +
                "address='" + address + '\'' +
                ", zip='" + zip + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
