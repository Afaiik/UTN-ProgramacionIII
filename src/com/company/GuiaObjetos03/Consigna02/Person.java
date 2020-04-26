package com.company.GuiaObjetos03.Consigna02;

import com.company.Common.Helpers;

public class Person {
    private long dni;
    private String name;
    private String lastName;
    private String email;
    private String address;

    public Person(){}
    public Person(long dni, String name, String lastName, String email, String adress) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        if(Helpers.checkValidEmail(email))
            this.email = email;
        else
            throw new IllegalArgumentException("ERROR: Invalid Email provided.");
        this.address = adress;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(Helpers.checkValidEmail(email))
            this.email = email;
        else
            throw new IllegalArgumentException("ERROR: Invalid Email provided.");
    }

    public String getAddress() {
        return address;
    }

    public void setAdress(String adress) {
        this.address = adress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "dni=" + dni +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
