package oop;

public class Address {
    private String country;
    private String city;
    private int postalCode;
    private String additionalData;

    public String getCountry() {
        return country;
    }

    //Todo add data validation for all the setters
    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(String additionalData) {
        this.additionalData = additionalData;
    }

    //constructor
    public Address(String country, String city, int postalCode, String additionalData){
        setCountry(country);
        setCity(city);
        setPostalCode(postalCode);
        setAdditionalData(additionalData);
    }

    //constructor overload
    public Address(String country){
        setCountry(country);
    }
}
