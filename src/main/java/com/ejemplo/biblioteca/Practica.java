//package com.ejemplo.biblioteca;
//
//import java.sql.SQLOutput;
//
//public class Practica {
//
//    public static void main(String[] args) {
//        System.out.println("Tarea 1");
//        String titulo = "Enfocate";
//        int año = 2016;
//        boolean disponibilidad = true;
//        System.out.println(titulo);
//        System.out.println(año);
//        System.out.println(disponibilidad);
//
//        System.out.println("Tarea 2");
//        if (año < 2000) {
//            System.out.println("Clasico");
//        } else if (año > 2000) {
//            System.out.println("Contemporáneo");
//        }
//        System.out.println("Tarea 3");
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Ejemplear " + i);
//        }
//
//        int multa1 = calcularMulta(3);
//        int multa2 = calcularMulta(10);
//        int multa3 = calcularMulta(0);
//
//        System.out.println("Valor multa por 3 días de retraso:$" + multa1);
//        System.out.println("Valor multa por 10 días de retraso:$" + multa2);
//        System.out.println("Valor multa por 0 días de retraso:$" + multa3);
//
//    }
//    public static int calcularMulta(int diasRetraso) {
//        return diasRetraso * 500;
//    }
//
//
//}
//
package com.ejemplo.biblioteca;

public class Practica {

    public static void main(String[] args) {
        Libro libro1 = new Libro("Enfocate", "Cal Newport", 2016);
        Libro libro2 = new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", 1997);
        Libro libro3 = new Libro("El principito", "Antoine de Saint-Exupéry", 1943);

        System.out.println("RESUMEN");
        System.out.println(libro1.resumen());
        System.out.println(libro2.resumen());
        System.out.println(libro3.resumen());

        System.out.println("ANTIGUEDAD");
        System.out.println(libro1.getTitulo() + " es antiguo: " + libro1.esAntiguo());
        System.out.println(libro2.getTitulo() + " es antiguo: " + libro2.esAntiguo());
        System.out.println(libro3.getTitulo() + " es antiguo: " + libro3.esAntiguo());
    }

    public static int calcularMulta(int diasRetraso) {
        return diasRetraso *  500;
    }
}
