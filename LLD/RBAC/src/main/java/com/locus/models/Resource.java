package com.locus.models;

import lombok.Getter;

import java.util.UUID;

@Getter
public class Resource {

    private UUID id;
    private String name;

    public Resource(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

}


// resource1 obj -> (r1, READ)
// resource2 obj -> (r1, WRITE)
// resource3