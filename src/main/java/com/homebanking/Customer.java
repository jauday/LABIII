package com.homebanking;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

public class Customer extends Person {
    private UUID id;
    private String userName;
    private Set<Account> accounts;
    private String phoneNumber;
    private Date registrationDate;

    public Customer(UUID id, String firstName, String lastName, Date birthDate, Address address, long personalId,
                    UUID id1, String userName, Set<Account> accounts, String phoneNumber, Date registrationDate) {
        super(id, firstName, lastName, birthDate, address, personalId);
        this.id = id1;
        this.userName = userName;
        this.accounts = accounts;
        this.phoneNumber = phoneNumber;
        this.registrationDate = registrationDate;
    }
    // Getters and setters
    // You can generate getters and setters using your IDE or write them manually
}