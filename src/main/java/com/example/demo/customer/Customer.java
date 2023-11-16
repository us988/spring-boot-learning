package com.example.demo.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class Customer {
    private final long id;
    @NotBlank
    private final String name;
    @NotBlank
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private final String Password;
    @NotBlank
    @Email
    private final String email;

    public Customer(long id, String name, String password, String email) {
        this.id = id;
        this.name = name;
        Password = password;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @JsonIgnore
    public String getPassword() {
        return Password;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Password='" + Password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


