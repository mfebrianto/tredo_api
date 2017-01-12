package com.tredo.api.models;

/**
 * Created by mfebrianto on 12/01/2017.
 */
public class User {

    private final long id;
    private final String email;
    private final String password;
    private final String passwordConfirmation;

    public User(long id, String email, String password, String passwordConfirmation) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.passwordConfirmation = passwordConfirmation;
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPasswordConfirmation() {
        return passwordConfirmation;
    }
}
