package Plantilla2;

public class Persona {
private String nombre;
private int edad;

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Edad: " + edad + "\n";
    }
}
