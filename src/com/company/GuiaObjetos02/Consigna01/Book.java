package com.company.GuiaObjetos02.Consigna01;

import java.util.ArrayList;

public class Book {

    private String title;
    private float price;
    private int stock;
    private ArrayList<Author> author;

    public Book(){}

    public Book(String title, float price, int stock, ArrayList<Author> author) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.author = author;
    }

    public Book(String title, float price, int stock, Author author) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.author = new ArrayList<Author>();
        this.author.add(author);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Author> getAuthor() {
        return author;
    }

    public void setAuthor(ArrayList<Author> author) {
        this.author = author;
    }
    public void addAuthor(Author author){
        this.author.add(author);
    }

    @Override
    public String toString() {
        return "Libro[" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", author=" + author.toString() +
                ']';
    }

    public String getDetails(){
        String ret = "El libro, " + this.getTitle();

        if(!this.getAuthor().isEmpty()){
            if(this.getAuthor().size() > 1){
                ret += " de los autores: ";
                for(Author author : this.getAuthor()){
                    ret += author.getName() +" " + author.getLastName() + ", ";
                }
                ret = ret.substring(0, ret.length() - 2); //Eliminar la ultima ',' y espacio
            }else
                ret += " del autor " + this.getAuthor().get(0).getName() + " " + this.getAuthor().get(0).getLastName();
        }

        ret += " Se vende a " + this.getPrice() +" pesos.";
        return ret;
    }
}
