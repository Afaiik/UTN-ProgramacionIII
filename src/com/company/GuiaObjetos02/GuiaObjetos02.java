package com.company.GuiaObjetos02;

import com.company.GuiaObjetos02.Consigna01.Author;
import com.company.GuiaObjetos02.Consigna01.Book;
import com.company.GuiaObjetos02.Consigna02.Bill;
import com.company.GuiaObjetos02.Consigna02.Customer;
import com.company.GuiaObjetos02.Consigna02.Product;
import com.company.GuiaObjetos02.Consigna03.Account;
import com.company.GuiaObjetos02.Consigna03.BankCustomer;

import java.util.ArrayList;

public class GuiaObjetos02 {

    public static void run(String[] args) {

    }

    public static void consigna01(){
        /*
        a. Inicialice un objeto de tipo Autor, “Joshua”, “Bloch”, “joshua@email.com”, ’M’. 
        */
        Author joshua = new Author("Joshua", "Bloch", "joshua@email.com", 'M');
        /*
        b. Imprima por pantalla al autor previamente instanciado. 
        */
        System.out.println("b. Imprima por pantalla al autor previamente instanciado.");
        System.out.println(joshua.toString());
        /*
        c. Inicialice el libro “Effective Java” del Autor “Joshua Bloch” que cuesta 450  pesos con una cantidad de 150 copias. 
        */
        Book effJava = new Book("Effective Java", 450, 150, joshua);
        /*
        d. Imprima por pantalla el libro instanciado. 
        */
        System.out.println("d. Imprima por pantalla el libro instanciado.");
        System.out.println(effJava.toString());
        /*
        e. Modifique el precio del libro “Effective Java” a 500 pesos y aumente la  cantidad en 50 copias. 
        */
        effJava.setPrice(500);
        effJava.setStock(effJava.getStock() + 50);
        /*
        f. Imprima por pantalla los atributos del Autor Joshua, accediendo desde el  Libro “Effective Java”. 
        */
        System.out.println("f. Imprima por pantalla los atributos del Autor Joshua, accediendo desde el  Libro “Effective Java”.");
        System.out.println(effJava.getAuthor().toString());
        /*
        g. Agregue un método a la clase Libro que posibilite imprimir en pantalla el  siguiente mensaje: 
        “El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.” 
        */
        System.out.println("g. imprimir en pantalla el  siguiente mensaje: ");
        System.out.println(effJava.getDetails());
        /*
        h. Modificar la clase Libro, para que acepte más de 1 Autor.
        Y realizar los  cambios necesarios en el método del punto g,
        para imprimir un nuevo  mensaje que liste los autores que contribuyeron a ese libro.
         */
        Author daron = new Author("Daron", "Malakian", "DaronMalakian@email.com", 'M');
        Author jeniffer = new Author("Jeniffer", "Perez", "JenifferPeres@email.com", 'F');
        effJava.addAuthor(daron);
        effJava.addAuthor(jeniffer);
        System.out.println("realizar los  cambios necesarios en el método del punto g");
        System.out.println(effJava.getDetails());
    }

    public static void consigna02(){

        /*
        b. Cree un objeto de tipo Cliente, imprima sus detalles por pantalla.
        */
        Customer juan = new Customer("Juan", "mail@mail.com", 13.5f);
        System.out.println(juan.toString());
        //Customer testRegex = new Customer("Juan", "mail@@mail.com", 13.5f);
        /*
        c. Cree un objeto de tipo Factura que posea al Cliente anteriormente creado. 
        */
        Product alcoholEnGel = new Product("Alcohol en Gel", 50, 250);
        Product jabonAntiCoronaVirus = new Product("Jabon anti CoronaVirus", 50, (float)57.5);
        Product escopetaPorSiTodoFalla = new Product("Escopeta por si todo falla", 50, 4000);

        ArrayList<Product> prodList = new ArrayList<Product>();
        prodList.add(alcoholEnGel);
        prodList.add(jabonAntiCoronaVirus);
        prodList.add(escopetaPorSiTodoFalla);

        Bill facturaUnProd = new Bill(juan, alcoholEnGel, false);

        Bill facturaMuchosProd = new Bill(juan, prodList, false);

        /*
        Una vez hecho esto, imprima por pantalla el monto total de esta Factura y el  monto total luego de aplicarle el descuento. 
        */
        System.out.println("Monto de la factura de Juan (1 prod) sin descuento: " + facturaUnProd.getAmount());
        facturaUnProd.applyDiscount();
        System.out.println("Monto de la factura de Juan (1 prod) con descuento: " + facturaUnProd.getAmount());


        System.out.println("Monto de la factura de Juan (n prods) sin descuento: " + facturaMuchosProd.getAmount());
        facturaMuchosProd.applyDiscount();
        System.out.println("Monto de la factura de Juan (n prods) con descuento: " + facturaMuchosProd.getAmount());
        /*
        d. Cree un método que facilite la impresión del objeto de tipo Factura y que  siga el siguiente formato.  
        Factura[id=?, fecha=?, monto=?, montoDesc=?,  Cliente[id=?, nombre=?,  email=?, descuento=?]] 
        */
        System.out.println("Factura un solo prod:");
        System.out.println();
        System.out.println(facturaUnProd.toString());
        System.out.println();
        System.out.println("Factura muchos prods:");
        System.out.println(facturaMuchosProd.toString());
        /*
        e. Analizar de agregar el tipo ItemVenta, que representa un producto que  forma parte de la venta.
        El mismo contiene un id, un nombre, descripción y  precio unitario.
        Considere las modificaciones necesarias en el tipo Factura  para que el mismo pueda almacenar múltiples
        Ítems de venta y a su vez  calcular los montos totales con y sin el descuento aplicado. 
         */
    }

    public static void consigna03(){
        /*
        a. Crear un Cliente e imprimirlo en pantalla. 
        */
        BankCustomer cliente = new BankCustomer("Mike", "M");
        /*
        b. Crear una Cuenta bancaria para el Cliente anterior con un saldo inicial de  10000. 
        */
        Account bankAccount = new Account(10000, cliente, true);
        /*
        c. Realizar operaciones de depósito y extracción para probar esa  funcionalidad.
        */
        bankAccount.makeDeposit(5000);
        try{
            bankAccount.makeExtraction(50000000);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        bankAccount.makeExtraction(5000);
        /* 
        d. Es necesario agregar una variante de Cuenta que permita un saldo deudor,  de máximo 2000 pesos.
        Esto significa que la cuenta puede aceptar un  balance negativo con un máximo de - 2000.
        Realice los cambios y pruebas  necesarias. 
        */
        bankAccount.makeExtraction(11000);
        bankAccount.makeExtraction(1000);
        //bankAccount.makeExtraction(1000); Error por querer extraer mas del limite de -2000


        /*
        e. Analice cómo implementaría con las herramientas conocidas hasta el  momento,
        llevar un registro de como máximo 10 operaciones de depósito y  extracción que se realizaron en la cuenta.
        En donde se almacene en  memoria de alguna forma la siguiente cadena de texto: 
            i. Depósito: ​"El {NombreCliente}, depositó {MontoDepositado}" 
            ii. Extracción: ​"El {NombreCliente}, retiró {MontoRetirado}
         */
        System.out.println(bankAccount.showLogs());

    }
}
