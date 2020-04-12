package com.company.GuiaObjetos01;

import com.company.GuiaObjetos01.Consigna1.Rectangulo;
import com.company.GuiaObjetos01.Consigna2.Empleado;
import com.company.GuiaObjetos01.Consigna3.Producto;
import com.company.GuiaObjetos01.Consigna4.CuentaBancaria;
import com.company.GuiaObjetos01.Consigna5.Hora;

public class GuiaObjetos01 {

    public static void run(String[] args) {
        System.out.println("Hello World ! :)");

        /* Modele el objeto Rectángulo con sus propiedades, ancho y alto. Ambas con valor  1,0 por defecto.
        Este objeto debe exponer los getters y setters necesarios.
        También  debe contar con un método para calcular el área y perímetro del mismo.
        Ejecute las  siguientes pruebas: 
        a. Inicializar un objeto Rectángulo estableciendo ancho y alto. 
        b. Imprimir por pantalla el alto y ancho. 
        c. Imprimir por pantalla el área y perímetro. 
        d. Modificar el alto y el ancho de la instancia. 
        e. Imprimir por pantalla nuevamente el cálculo del área y perímetro. 
        f. Inicializar un objeto Rectángulo con los valores por defecto y verificar. 
        */

        Rectangulo rectangulo = new Rectangulo(20,20);
        Consigna1(rectangulo);

        /*Modele el objeto Empleado que posee las siguientes características,
        dni, nombre,  apellido y salario.
        El mismo debe contar con la posibilidad de calcular el salario  anual.
        A su vez se requiere otro método que permita aumentar el salario 
        dependiendo del porcentaje que se le pase por parámetro.
        Considere crear un  método que facilite imprimir por pantalla las características del objeto
        de la  siguiente forma:  Empleado[dni=?, nombre=?, apellido=?, salario=?] 
        a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de  25000. 
        b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de  27500. 
        c. Imprima ambos objetos por pantalla 
        d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el  salario anual del mismo. 
        */
        Consigna2();

        /*
        Modele el objeto Ítem de Venta con las siguientes propiedades,
        identificador,  descripción, cantidad y precio unitario.
        Cree los métodos para calcular el precio  total
        teniendo en cuenta el precio unitario y cantidad.
        Un método que permita  imprimir por pantalla los atributos del objeto de la siguiente forma: 
        ItemVenta[id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?] 
        a. Inicialice el objeto con los atributos necesarios 
        b. Imprima por pantalla el objeto inicializado.
        */
        Consigna3();

        /*Modele el objeto que representa la cuenta de un banco,
        con identificador, nombre  y balance.
        Considere los getters, setters y constructores necesarios.
        Tenga en  cuenta los siguientes métodos. 
        a. El método crédito que representa un depósito de dinero en la cuenta.
        Este  método debe devolver el balance luego de la operación. 
        b. El método débito que representa una sustracción de dinero de la cuenta. 
        Este método debe devolver el balance luego de la operación.
        Si el dinero en  la cuenta no es suficiente para cubrir la sustracción,
        se debe imprimir por  pantalla un aviso.  
        c. Un método que imprima por pantalla las características del objeto. 
        Realice las siguientes operaciones: 
        1. Inicialice una cuenta con un monto inicial de 15000. 
        2. Realice una operación de crédito de 2500. 
        3. Realice una operación de compra de 1500. 
        4. Realice una operación de compra de 30000. 
        5. Imprima por pantalla los valores de la cuenta y verifique que el balance sea  correcto. */
        Consigna4();

        /*
         5. Modele el objeto Hora, teniendo en cuenta sus atributos, hora, minuto y segundo. 
         Tenga en cuenta el rango de valores aceptados para cada uno de estos. 
         a. Hora: 0 … 23  b. Minuto: 0 … 59  c. Segundo: 0 … 59 
         Considere el siguiente comportamiento: 
         1. Un método que imprima la hora bajo el siguiente formato ​hh:mm:ss 
         usando zero a la izquierda ejemplo 13:04:22 . 
         2. Un método que avance en 1 segundo y devuelva la instancia del objeto. 
         3. Un método que retroceda en 1 segundo y devuelva la instancia del objeto. 
         4. Instanciar el objeto y probar los métodos creados. 
         */
        Consigna5();

    }

    private static void Consigna1(Rectangulo rectangulo){
        System.out.println("-------- Consigna 1 --------\n");

        System.out.println("El area es " + rectangulo.GetArea());
        //b. Imprimir por pantalla el alto y ancho. 
        System.out.println("El ancho es " + rectangulo.GetAncho());
        System.out.println("El alto es " + rectangulo.GetAlto());
        //c. Imprimir por pantalla el área y perímetro. 
        System.out.println("El perimetro es " + rectangulo.GetPerimetro());
        System.out.println("El area es " + rectangulo.GetArea());
        //d. Modificar el alto y el ancho de la instancia. 
        rectangulo.SetAncho(40);
        rectangulo.SetAlto(40);
        //e. Imprimir por pantalla nuevamente el cálculo del área y perímetro. 
        System.out.println("El nuevo perimetro es " + rectangulo.GetPerimetro());
        System.out.println("El nuevo area es " + rectangulo.GetArea());
        System.out.println();
    }

    private static void Consigna2(){
        System.out.println("-------- Consigna 2 --------\n");

        //a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de  25000. 
        Empleado Carlitos = new Empleado(23456345,"Carlos", "Gutiérrez", (float)25000);
        //b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de  27500. 
        Empleado Ana = new Empleado(34234123,"Ana", "Sánchez", (float)27500);
        //c. Imprima ambos objetos por pantalla 
        System.out.println(Carlitos.toString());
        System.out.println(Ana.toString());
        //d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el  salario anual del mismo. 
        Carlitos.IncrementarSueldoByPorcentaje(15);
        System.out.println("Se ha incrementado el sueldo de "+Carlitos.getNombre()+", su nuevo salario es " + Carlitos.getSalario());
        System.out.println();
    }

    private static void Consigna3(){
        System.out.println("-------- Consigna 3 --------\n");

        //a. Inicialice el objeto con los atributos necesarios 
        Producto primerProducto = new Producto(1, "Alcohol en Gel", 3, 500);
        // b. Imprima por pantalla el objeto inicializado.
        System.out.println(primerProducto.toString());;
        System.out.println();
    }

    private static void Consigna4(){
        System.out.println("-------- Consigna 4 --------\n");

        //1. Inicialice una cuenta con un monto inicial de 15000. 
        CuentaBancaria cuenta = new CuentaBancaria(1, "Cuenta de Juan Perez", 15000);
        //2. Realice una operación de crédito de 2500. 
        System.out.println("Se realiza Acreditación, Balance actual: " + cuenta.Acreditar(2500));
        //3. Realice una operación de compra de 1500. 
        System.out.println("Se realiza Debito, Balance actual: " + cuenta.Debitar(1500));
        //4. Realice una operación de compra de 30000. 
        System.out.println("Se realiza Debito, Balance actual: " + cuenta.Debitar(30000));
        //5. Imprima por pantalla los valores de la cuenta y verifique que el balance sea  correcto.
        System.out.println(cuenta.toString());
        var message = cuenta.getBalance() == 15000+2500-1500 ? "Balance correcto :)" : "Balance INCORRECTO :(";
        System.out.println(message);
        System.out.println();
    }

    private static void Consigna5(){
        System.out.println("-------- Consigna 5 --------\n");

        //Instanciar el objeto y probar los métodos creados. 
        Hora hora = new Hora();
        //Probando constructor por defecto:
        System.out.println("La hora actual es " + hora.toString());

        Hora otraHora = new Hora(1,5,12);
        System.out.println("La otra hora que cree es: " +otraHora.toString());

        try{
            Hora horaIncorrecta = new Hora(70,50,100);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
