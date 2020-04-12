package com.company.GuiaObjetos02.Consigna03;

import java.util.UUID;

public class BankCustomer {
    //Para esto identificamos los atributos id, nombre y género (M o F) para el  Cliente.
    private UUID id;
    private String name;
    private String gender;

    public BankCustomer(String name, String gender) {
        this.id = UUID.randomUUID();
        this.name = name;
        setGender(gender); //se utiliza setter para tener que hacer la validación de M o F una sola vez
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if(!gender.toUpperCase().equals("M") && !gender.toUpperCase().equals("F"))
            throw new IllegalArgumentException("Error: Incorrect parameter for Gender. Only 'M' or 'F' is allowed");
        else
            this.gender = gender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
