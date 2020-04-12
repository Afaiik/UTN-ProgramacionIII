package com.company.GuiaObjetos01.Consigna2;

public class Empleado extends Persona {

    private Float Salario;

    public Empleado(){

    }

    public Empleado(int dni, String nombre, String apellido, Float salario) {
        super(dni, nombre, apellido);
        this.Salario = salario;
    }

    public Float getSalario() {
        return Salario;
    }

    public void setSalario(Float salario) {
        Salario = salario;
    }

    public void IncrementarSueldoByPorcentaje(int porcentaje){
        this.setSalario(this.getSalario() + (this.getSalario() * porcentaje) / 100);
    }

    @Override
    public String toString() {
        return "Empleado[dni="+ this.getDni() +", nombre="+this.getNombre()+", apellido="+this.getApellido()+", salario="+this.getSalario()+"] ";
    }
}
