package Aula.Code.Lista;

public class Address {

    private String location;
    private String city;
    private String country;
    private String [] peopleLivingInside;

    public Address(String location, String city, String country) {
        this.location = location;
        this.city = city;
        this.country = country;
    }

    public Address(String location, String country) {
        this.location = location;
        this.country = country;
    }

    public Address(String location, String city, String country, String[] peopleLivingInside) {
        this.location = location;
        this.city = city;
        this.country = country;
        this.peopleLivingInside = peopleLivingInside;
    }
}
