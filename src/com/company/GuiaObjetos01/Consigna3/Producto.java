package com.company.GuiaObjetos01.Consigna3;

public class Producto {
    private int Id;
    private String Descripcion;
    private int Cantidad;
    private float PrecioUnidad;

    public Producto() {
    }

    public Producto(int id, String descripcion, int cantidad, float precioUnidad) {
        Id = id;
        Descripcion = descripcion;
        Cantidad = cantidad;
        PrecioUnidad = precioUnidad;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public float getPrecioUnidad() {
        return PrecioUnidad;
    }

    public void setPrecioUnidad(float precioUnidad) {
        PrecioUnidad = precioUnidad;
    }

    @Override
    public String toString() {
        return "ItemVenta[" +
                "id=" + Id +
                ", descripción='" + Descripcion + '\'' +
                ", cantidad=" + Cantidad +
                ", pUnitario=" + PrecioUnidad +
                ", pTotal= ??" +
                ']';
    }
}
