package com.company.GuiaObjetos02.Consigna02;

import com.company.GuiaObjetos02.Common.AppParameters;
import com.company.GuiaObjetos02.Common.Helpers;


import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

public class Bill {

    private UUID id;
    private float amount;
    private LocalDateTime date;
    private Customer customer;
    private ArrayList<Product> products;

    public Bill(){}
    public Bill(Customer customer, Product product, boolean applyDiscount) {
        this.id = UUID.randomUUID();
        this.date = LocalDateTime.now();
        this.customer = customer;
        this.products = new ArrayList<Product>();
        this.products.add(product);
        this.amount = applyDiscount ? getAmountWithDiscount(customer.getDiscount(), product.getUnitPrice()) : product.getUnitPrice();
    }
    public Bill(Customer customer, ArrayList<Product> products, boolean applyDiscount) {
        this.id = UUID.randomUUID();
        this.date = LocalDateTime.now();
        this.customer = customer;
        this.products = products;
        this.amount = getAmountFromProducts(products, applyDiscount);
    }

    public UUID getId() {
        return id;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    //Se entiende que la fecha es modificable despues de la creación del objeto
    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public void addProduct(Product product){
        this.products.add(product);
    }
    public ArrayList<Product> getProducts(){
        return this.products;
    }
    public void applyDiscount(){
        this.amount = this.amount - ((this.amount * this.customer.getDiscount()) / 100);
    }

    private static float getAmountWithDiscount(float discount, float amount){
        return amount - ((amount * discount) / 100);
    }

    private float getAmountFromProducts(ArrayList<Product> products, boolean applyDiscount){
        float total = 0;
        for(Product prod : products){
            total += prod.getUnitPrice();
        }
        return applyDiscount ? getAmountWithDiscount(this.customer.getDiscount(), total) : total;
    }

    @Override
    public String toString() {
        String ret = "Bill{" +
                "id=" + id +
                ", amount=" + amount +
                ", date=" + date +
                ", customer=" + customer.toString();
        ret += ", products=";
        for(Product prod : this.products) {
            ret += prod.toString();
        }

        ret += '}';

        return ret;
    }
}
