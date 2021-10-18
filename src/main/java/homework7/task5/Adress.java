package homework7.task5;

public class Adress {
    String country;
    String city;
    String street;

    public Adress() {
    }

    public Adress(String country, String city, String street) {
        this.country = country;
        this.city = city;
        this.street = street;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
