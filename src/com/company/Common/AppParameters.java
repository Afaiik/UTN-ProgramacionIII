package com.company.Common;

import java.util.ArrayList;

public class AppParameters {

    private AppParameters(){}

    public static final int bankAccountMaxCreditAmount = -2000;
    public static final int logTypeExtraction = 1;
    public static final int logTypeDeposit = 2;
    public static final ArrayList<Character> staffShiftsAvailable = new ArrayList<Character>(){{
        add('m');
        add('M');
        add('a');
        add('A');
        //Accepted values for "Morning" and "Afternoon"
    }};
    public static final String consignaPrueba = "Esto es una consigna de prueba";
    public static final String consigna01Guia01 = "Modele el objeto Rectángulo con sus propiedades, ancho y alto. \n" +
            "Ambas con valor  1,0 por defecto. \n" +
            "Este objeto debe exponer los getters y setters necesarios. \n" +
            "También  debe contar con un método para calcular el área y perímetro del mismo. \n";

    public static final String consigna02Guia01 = "Modele el objeto Empleado que posee las siguientes características, \n" +
            "dni, nombre,  apellido y salario. \n" +
            "El mismo debe contar con la posibilidad de calcular el salario  anual. \n" +
            "A su vez se requiere otro método que permita aumentar el salario  \n" +
            "dependiendo del porcentaje que se le pase por parámetro. \n" +
            "Considere crear un  método que facilite imprimir por pantalla las características \n" +
            "del objeto de la  siguiente forma:  Empleado[dni=?, nombre=?, apellido=?, salario=?]\n";

    public static final String consigna03Guia01 = "Modele el objeto Ítem de Venta con las siguientes propiedades, \n" +
            "identificador,  descripción, cantidad y precio unitario. \n" +
            "Cree los métodos para calcular el precio  total teniendo en cuenta el \n" +
            "precio unitario y cantidad. \n" +
            "Un método que permita  imprimir por pantalla los atributos del objeto \n" +
            "de la siguiente forma:  ItemVenta[id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?]  \n";

    public static final String consigna04Guia01 = "Modele el objeto que representa la cuenta de un banco, \n" +
            "con identificador, nombre  y balance. \n" +
            "Considere los getters, setters y constructores necesarios. Tenga en  cuenta los siguientes métodos. \n" +
            "a. El método crédito que representa un depósito de dinero en la cuenta. \n" +
            "Este  método debe devolver el balance luego de la operación.  \n" +
            "b. El método débito que representa una sustracción de dinero de la cuenta.  \n" +
            "Este método debe devolver el balance luego de la operación. \n" +
            "Si el dinero en  la cuenta no es suficiente para cubrir la sustracción, se debe \n" +
            "imprimir por  pantalla un aviso. \n" +
            "c. Un método que imprima por pantalla las características del objeto\n";


    public static final String consigna05Guia01 = "Modele el objeto Hora, teniendo en cuenta sus atributos, hora, minuto y segundo.  \n" +
            "Tenga en cuenta el rango de valores aceptados para cada uno de estos.  \n" +
            "a. Hora: 0 … 23  b. Minuto: 0 … 59  c. Segundo: 0 … 59 \n";

    public static final String consigna01Guia02 = "Es necesario modelar el objeto de tipo Libro con las siguientes caracteristicas, \n" +
            "titulo,  precio, stock y Autor, este último posee las características \n" +
            "de nombre, apellido,  email y genero ( ‘M’ o ‘F’ ). \n" +
            "Para este ejercicio vamos a asumir que un libro tiene un  único autor\n" +
            "Update:  Modificar la clase Libro, para que acepte más de 1 Autor\n";

    public static final String consigna02Guia02 = " Nos contratan para hacer un programa que lleve el control de las ventas de un  local. \n" +
            "Para esto es necesario modelar la clase Cliente, que posee un atributo id  como identificador del cliente, \n" +
            "el mismo debe ser un valor compuesto por letras y  números aleatorios que se generan \n" +
            "automáticamente al crear un Cliente. El Cliente  también posee un \n" +
            "nombre, un email y un porcentaje de descuento. \n" +
            " Por otro lado vamos a tener el objeto Factura que representa una venta del  local,\n" +
            " cada Factura posee un identificador de las mismas características que el  usado en Cliente. \n" +
            "A su vez cada factura posee un monto total, una fecha y el Cliente  que generó la compra.\n" +
            " Para la fecha de la venta se le va a asignar la fecha y hora al  momento de creación del objeto Factura.\n" +
            " El tipo Factura debe contar con un  método que calcule el monto final luego de aplicarle el descuento que posee el  cliente.\n";

    public static final String consigna03Guia02 = "Necesitamos crear un programa para manejar los datos de una Cuenta bancaria de  un Cliente. \n" +
            "Para esto identificamos los atributos id, nombre y género (M o F) para el  Cliente. \n" +
            "Por otro lado tenemos el tipo Cuenta que también posee un identificador,  \n" +
            "un balance y un Cliente que es el dueño de la cuenta. \n" +
            "La Cuenta debe exponer los  métodos depositar y extraer que modifican el balance de la misma. \n" +
            "Algo a tener en  cuenta es que el método extraer no puede extraer dinero si el balance\n" +
            " total no lo  permite, si esto sucede se debe imprimir un mensaje por pantalla \n" +
            "que indique que  la cuenta no posee saldo suficiente\n";

    public static final String consigna01Guia03 = "Para comenzar esta guía, vamos a empezar con un ejemplo sencillo, que nos  permita entender el concepto \n" +
            "de herencia, superclase y subclase. Para esto vamos a  definir el tipo Círculo, \n" +
            "que posee un radio cuyo valor por defecto al ser inicializado  sin valores es 1.0. \n" +
            "Además el tipo Círculo posee un atributo color, por defecto rojo,  un método para calcular el \n" +
            "área y otro para imprimir sus características. Puede  reutilizar la clase Circulo de las guías anteriores.   \n" +
            "Por otro lado tenemos un tipo Cilindro, que extiende a la clase Circulo, por  ende se convierte en subclase de Círculo.\n" +
            "El Cilindro a diferencia del Círculo posee  un atributo altura, que también se inicializa en 1.0 \n" +
            "cuando no le pasamos un valor a  su constructor. Y un método para calcular el volumen\n";

    public static final String consigna02Guia03 = "Vamos a diseñar un programa que nos permita gestionar el personal que concurre  a un colegio. \n" +
            "Para no hacerlo muy extenso vamos a limitarnos a estudiantes y  miembros de staff que \n" +
            "a diferencia de los estudiantes, estos perciben una  remuneración. Ambos tipos comparten \n" +
            "la característica de Persona que posee los  atributos de dni, nombre, apellido, email y direccion.  \n" +
            "Por otro lado tenemos al Estudiante que posee las características de  Persona y las de un estudiante, \n" +
            "que en este caso son, año de ingreso, cuota  mensual y carrera.  Y finalmente tenemos al miembro de Staff \n" +
            "que también es una Persona pero  con características propias de alguien que trabaja para una institución, \n" +
            "por ejemplo  salario y turno, este puede ser mañana o noche\n";

    public static final String consigna03Guia03 = "Necesitamos crear un programa que nos permita crear diferentes tipos de figuras  que poseen un color, \n" +
            "estas figuras pueden o no estar coloreadas. \n" +
            "Además  necesitamos que las figuras tengan la posibilidad de calcular area y perimetro. \n" +
            "Por  el momento nos piden crear 2 Figuras, Círculo y Rectángulo. ambos deben contar  \n" +
            "con sus respectivas características, ya sea radio, alto, largo, etc. \n" +
            "Y deben contar con  los métodos de cálculo de area y perimetro implementados. \n";
}
