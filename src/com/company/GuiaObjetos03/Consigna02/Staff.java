package com.company.GuiaObjetos03.Consigna02;

import com.company.Common.AppParameters;

public class Staff extends Person {
    private float salary;
    private char shift;

    public Staff(long dni, String name, String lastName, String email, String adress, float salary, char shift) {
        super(dni, name, lastName, email, adress);
        this.salary = salary;
        if(AppParameters.staffShiftsAvailable.contains(shift)){
            this.shift = shift;
        }else
            throw new IllegalArgumentException("ERROR: Illegal value for \"Shift\". Accepted values are: " + AppParameters.staffShiftsAvailable.toString());
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public char getShift() {
        return shift;
    }

    public void setShift(char shift) {
        if(AppParameters.staffShiftsAvailable.contains(shift)){
            this.shift = shift;
        }else
            throw new IllegalArgumentException("ERROR: Illegal value for \"Shift\". Accepted values are: " + AppParameters.staffShiftsAvailable.toString());
    }

    public float getYearSalary(){
        return this.salary * 12;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "dni=" + this.getDni() +
                ", name='" + this.getName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", email='" + this.getEmail() + '\'' +
                ", address='" + this.getAddress() + '\'' +
                ", salary=" + salary +
                ", shift=" + shift +
                '}';
    }
}
