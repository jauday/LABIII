package com.homebanking;


import java.util.Date;
import java.util.UUID;

public class Person {
    private UUID id;
    private String firstName;
    private String  lastName;
    private Date birthDate;
    private Address address;
    private long personalId;

    public Person(UUID id, String firstName, String lastName, Date birthDate, Address address, long personalId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.personalId = personalId;
    }
}

