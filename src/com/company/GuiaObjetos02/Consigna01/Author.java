package com.company.GuiaObjetos02.Consigna01;

import java.security.InvalidParameterException;

public class Author {

    private String name;
    private String lastName;
    private String email;
    private char gender;

    public Author(){}

    public Author(String name, String lastName, String email, char gender) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        setGender(gender);
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
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender != 'M' && gender != 'F'){
            throw new InvalidParameterException("Error: Author name can only be M or F.");
        }else
            this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author[" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ']';
    }
}
