package com.company.GuiaObjetos01.Consigna2;

public class Persona {

    private int Dni;
    private String Nombre;
    private String Apellido;

    public Persona(){

    }
    public Persona(int dni, String nombre, String apellido) {
        Dni = dni;
        Nombre = nombre;
        Apellido = apellido;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int dni) {
        Dni = dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }
}
