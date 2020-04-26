package com.company.GuiaObjetos03;

import com.company.GuiaObjetos03.Consigna01.Cylinder;
import com.company.GuiaObjetos03.Consigna02.Person;
import com.company.GuiaObjetos03.Consigna02.Staff;
import com.company.GuiaObjetos03.Consigna02.Student;
import com.company.GuiaObjetos03.Consigna03.Circle;
import com.company.GuiaObjetos03.Consigna03.Rectangle;
import com.company.GuiaObjetos03.Consigna03.Square;
import org.w3c.dom.css.Rect;

import java.util.ArrayList;

public class GuiaObjetos03 {
    public static void run(String[] args) {
        //consigna01();

        //consigna02();

        consigna03();
    }

    public static void consigna01(){
        /*
        Inicializar un Cilindro y debuguear analizando los constructores a los que va  llamando para inicializar la cadena de herencia.
        */
        Cylinder cilindro = new Cylinder();

        /*
        Imprimir por pantalla, el  radio del cilindro, la altura, el área de la base y el volumen. 
        */
        System.out.println("---Cilindro");
        System.out.println("Radio "+cilindro.getRadius());
        System.out.println("Altura "+cilindro.getHeight());
        System.out.println("Area "+cilindro.getArea());
        System.out.println("Volumen "+cilindro.getVolume());
        /*
        ● Inicializar un segundo CIlindro esta vez especificando la altura y radio. 
        */
        Cylinder newCilindro = new Cylinder(4,3);
        /*
        Imprimir por pantalla el radio, la altura, el área de la base y el volumen. 
        */
        System.out.println("Radio "+cilindro.getRadius());
        System.out.println("Altura "+cilindro.getHeight());
        System.out.println("Area "+cilindro.getArea());
        System.out.println("Volumen "+cilindro.getVolume());

        /*
        ● Sobreescribir el método calcular area declarado en Círculo, para que nos  permita calcular el área del cilindro. 
        (2π×radius×height + 2×areaBase) 
        Imprimir por pantalla el área y el volumen del cilindro.
        Vamos a notar que el  cálculo del volumen difiere, esto es porque nosotros sobreescribimos el método  calcular area y ahora nos calcula el área de un cilindro. Modificar el método calcular  volumen en la clase cilindro para que llame al método de la ​SUPER​clase que calcula  el área.  ● Modificar el método toString() de la clase cilindro para que imprima por  pantalla lo siguiente  Cilindro: subclase de  + {toString() de Círculo} +altura= {alturaCilindro}; 
         */
    }

    public static void consigna02(){
        /*
         Inicializar 4 estudiantes diferentes. 
         */
        Student tito = new Student(123,"Tito", "Perez", "mail@mail.com", "address", 2019, 4500, "Programacion");
        Student maria = new Student(123,"Maria", "Aguirre", "mail@mail.com", "address", 2019, 1200, "Arquitectura");
        Student gonza = new Student(123,"Gonza", "Orellano", "mail@mail.com", "address", 2019, 1357, "Programacion");
        Student ozzy = new Student(123,"Ozzy", "Osbourne", "mail@mail.com", "address", 2019, 1205, "Textil");
        /*
         ● Inicializar 4 miembros de staff con características diferentes. 
         */
        Staff sergio = new Staff(123, "Sergio", "Garguir", "mail@mail.com", "Address 123", 45000, 'm');
        Staff gonzaProf = new Staff(123, "Gonza", "Orellano Profe", "mail@mail.com", "Address 123", 48000, 'M');
        Staff lauman = new Staff(123, "Prof", "Lauman", "mail@mail.com", "Address 123", 49000, 'A');
        Staff susi = new Staff(123, "Susi", "Perez", "mail@mail.com", "Address 123", 52500, 'A');
        /*
         ● Crear un array que permita almacenar juntos los tipos anteriores y  almacenar las 8 instancias creadas anteriormente. 
         */
        ArrayList<Person> arrayPerson = new ArrayList<Person>(){{
            add(tito);
            add(maria);
            add(gonza);
            add(ozzy);
            add(sergio);
            add(gonzaProf);
            add(lauman);
            add(susi);
        }};
        /*
         ● Investigar el uso de la palabra reservada instanceof. 
         ● Recorrer el array y mostrar por pantalla la cantidad de estudiantes y  la cantidad de miembros de staff. 
         */
        int cantStudents = 0;
        int cantStaff = 0;
        for(Person per : arrayPerson){
            if(per instanceof Student)
                cantStudents++;
            else
                cantStaff++;
        }
        System.out.println("Cantidad de Alumnos: " + cantStudents);
        System.out.println("Cantidad de Profesores: " + cantStaff);
        /*
         ● Recorrer el array y sumar el total de ingresos que percibe la  institución por parte de la cuota de estudiantes. 
         */
        double totalIncome = arrayPerson.stream()
                .filter(x -> x instanceof Student)
                .mapToDouble(x -> ((Student) x).getMonthlyFee())
                .sum();

        System.out.println("Total de ingreso de la institución: " + totalIncome);
    }

    public static void consigna03(){
        /*
        Crear diferentes instancias de cada tipo e imprimir sus  características.
         */
        Circle circle = new Circle("black", 12.2f);

        Rectangle rectangle = new Rectangle("red", 3, 4);
        Rectangle rectangleErrorTest = new Rectangle("red", 3, 3);

        Square square = new Square("blue", 33.4f);

        System.out.println("Figura->Circulo");
        System.out.println(circle.toString());
        System.out.println("Figura->FiguraCuadrada->Rectangulo");
        System.out.println(rectangle.toString());
        System.out.println("Figura->FiguraCuadrada->Cuadrado");
        System.out.println(square.toString());
    }
}
