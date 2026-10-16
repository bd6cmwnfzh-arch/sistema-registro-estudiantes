
/*
 * Aplicacion: Sistema de Registro de Estudiantes
 * Objetivo: Registrar estudiantes y consultar sus calificaciones.
 */

// Clase que representa a un estudiante.
class Estudiante {

    // Atributos del estudiante.
    String nombre;
    double calificacion;

    // Constructor para inicializar los atributos.
    Estudiante(String nombre, double calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    // Metodo que muestra los datos del estudiante.
    void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Calificacion: " + calificacion);

        if (calificacion >= 70) {
            System.out.println("Estado: Aprobado");
        } else {
            System.out.println("Estado: No aprobado");
        }

        System.out.println("---------------------");
    }
}

// Clase principal del programa.
public class Main {

    public static void main(String[] args) {

        // Instanciacion de objetos.
        Estudiante estudiante1 =
            new Estudiante("Ana Lopez", 92);

        Estudiante estudiante2 =
            new Estudiante("Carlos Ruiz", 65);

        // Uso del metodo para mostrar los datos.
        estudiante1.mostrarDatos();
        estudiante2.mostrarDatos();
    }
}
