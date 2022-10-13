package com.api.pet.management.application.core.domain;

import java.io.Serializable;

public class Adress implements Serializable {
    private String zip;
    private Integer number;
    private String street;
    private String city;
    private String state;
    private String country;
    private String complement;

    public Adress() {
    }

    public Adress(String zip, Integer number, String street, String city, String state, String country, String complement) {
        this.zip = zip;
        this.number = number;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.complement = complement;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }
}
