package com.company.GuiaObjetos03.Consigna02;


public class Student extends Person {
    private int entryYear;
    private float monthlyFee;
    private String degree;

    public Student(long dni, String name, String lastName, String email, String address, int entryYear, float monthlyFee, String degree) {
        super(dni, name, lastName, email, address);
        this.entryYear = entryYear;
        this.monthlyFee = monthlyFee;
        this.degree = degree;
    }

    public int getEntryDate() {
        return entryYear;
    }

    public void setEntryDate(int entryDate) {
        this.entryYear = entryYear;
    }

    public float getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(float monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public float getYearFee(){
        return this.monthlyFee * 12;
    }

    @Override
    public String toString() {
        return "Student{" +
                "dni=" + this.getDni() +
                ", name='" + this.getName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", email='" + this.getEmail() + '\'' +
                ", address='" + this.getAddress() + '\'' +
                ", entryYear=" + entryYear +
                ", monthlyFee=" + monthlyFee +
                ", degree='" + degree + '\'' +
                '}';
    }
}
