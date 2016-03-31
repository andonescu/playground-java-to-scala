package main.java.day1;

import java.util.Optional;

/**
 * Created by Ionut on 10.03.2016.
 */
public class Address {
    public String street;
    public Optional<String> number;
    public String city;
    public Optional<String> county;
    public String country;

    public Address(String street, String city, String country) {
        this.street = street;
        this.number = Optional.empty();
        this.city = city;
        this.county = Optional.empty();
        this.country = country;
    }

    public Address(String street, Optional<String> number, String city, Optional<String> county, String country) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.county = county;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Optional<String> getNumber() {
        return number;
    }

    public void setNumber(Optional<String> number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Optional<String> getCounty() {
        return county;
    }

    public void setCounty(Optional<String> county) {
        this.county = county;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number=" + number +
                ", city='" + city + '\'' +
                ", county=" + county +
                ", country='" + country + '\'' +
                '}';
    }
}
