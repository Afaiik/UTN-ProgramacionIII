package com.company.GuiaObjetos01.Consigna4;

public class CuentaBancaria {
    private int Id;
    private String Nombre;
    private float Balance;

    public CuentaBancaria(){

    }
    public CuentaBancaria(int id, String nombre, float balance) {
        Id = id;
        Nombre = nombre;
        Balance = balance;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public float getBalance() {
        return Balance;
    }

    public void setBalance(float balance) {
        Balance = balance;
    }

    public String BalancetoString() {
        return "Balance actual: " + this.Balance;
    }

    @Override
    public String toString() {
        return "CuentaBancaria[" +
                "Id=" + Id +
                ", Nombre='" + Nombre + '\'' +
                ", Balance=" + Balance +
                ']';
    }

    public float Acreditar(float monto){
        setBalance(this.getBalance() + monto);
        return getBalance();
    }

    public float Debitar(float monto){
        try{
            if((this.getBalance() - monto) > 0) {
                setBalance(this.getBalance() - monto);
            }
            else
                throw new Exception("Balance insuficiente para realizar la operación. Intentó debitar "+ monto + " y la cuenta dispone de " + this.getBalance());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        return getBalance();
    }

}
