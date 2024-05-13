package com.homebanking;

public class Address {
    private String street;
    private Integer number;
    private String city;
    private String state;
    private String country;

    public Address(String street, Integer number, String city, String state, String country) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
