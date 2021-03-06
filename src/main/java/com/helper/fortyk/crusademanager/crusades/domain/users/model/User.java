package com.helper.fortyk.crusademanager.crusades.domain.users.model;

import com.helper.fortyk.crusademanager.crusades.domain.crusadeforce.model.CrusadeForce;

import java.util.List;

public class User {

    private final String username;
    private final Email email;
    private final List<CrusadeForce> crusadeForces;

    private User(String username, Email email, List<CrusadeForce> crusadeForces) {
        this.username = username;
        this.email = email;
        this.crusadeForces = crusadeForces;
    }

    public static User of(String username, Email email, List<CrusadeForce> crusadeForces) {
        return new User(username, email, crusadeForces);
    }
}
