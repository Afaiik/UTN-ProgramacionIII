package com.company.GuiaObjetos02.Consigna02;

import com.company.Common.Helpers;

import java.util.UUID;

public class Customer {

    private UUID id;
    private String name;
    private String email;
    private float discount;
    public Customer(String name, String email, float discount) {

        this.id = UUID.randomUUID();
        this.name = name;

        if(Helpers.checkValidEmail(email))
            this.email = email;
        else
            throw new IllegalArgumentException("Error: Customer: email parameter was not valid.");

        this.discount = discount;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(Helpers.checkValidEmail(email))
            this.email = email;
        else
            throw new IllegalArgumentException("Error: Customer: email parameter was not valid.");
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", discount=" + discount +
                '}';
    }
}
