package CityMap;

public class Address {
    String addressLine1, addressLine2, city, state;
    int pincode;

    public Address(String line1, String line2, String city, String state, int pincode) {
        this.addressLine1 = line1;
        this.addressLine2 = line2;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return addressLine1 + " " + addressLine2 + " " + city
                + " " + state + " " + pincode;
    }

}