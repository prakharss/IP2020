package com.locus.models;

import java.util.UUID;

public abstract class Account {

    private UUID id;
    private String firstName;
    private String lastName;
    private String email;

    public Account(String firstName, String lastName, String email) {
        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

}
