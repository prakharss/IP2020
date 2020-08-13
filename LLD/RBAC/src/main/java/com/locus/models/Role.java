package com.locus.models;

import lombok.Getter;

import java.util.UUID;

@Getter
public class Role {

    private UUID id;
    private String name;

    public Role(String roleName) {
        this.id = UUID.randomUUID();
        this.name = roleName;
    }
}