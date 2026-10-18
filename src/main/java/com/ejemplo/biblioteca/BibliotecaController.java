package com.ejemplo.biblioteca;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class BibliotecaController {

    @GetMapping("/libro")
    public Libro obtenerLibro() {
        return new Libro("Enfocate", "Cal Newport", 2016);
    }

    @GetMapping("/libros")
    public List<Libro> obtenerLibros() {
        return List.of(
                new Libro("Enfocate", "Cal Newport", 2016),
                new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", 1997),
                new Libro("El principito", "Antoine de Saint-Exupéry", 1943)
        );
    }

    @GetMapping("/libro/resumen")
    public String obtenerResumen() {
        Libro libro = new Libro("Enfocate", "Cal Newport", 2016);
        return libro.resumen();
    }

    @GetMapping("/prestamo/{dias}")
    public String calcularPrestamo(@PathVariable int dias) {
        if (dias > 14) {
            int diasRetraso = dias - 14;
            int multa = diasRetraso * 500;
            return "Préstamo vencido. Multa: $" + multa;
        } else {
            return "Préstamo vigente";
        }
    }
}