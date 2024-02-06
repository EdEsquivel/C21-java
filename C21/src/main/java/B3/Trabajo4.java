package B3;

import java.util.Scanner;

//Seleccionar la estructura de dato correcta para el siguiente ejercicio.
    // Hacer un programa que capture el promedio de la nota de 5 estudiantes y que almacene los datos como nombre, y telefono.

public class Trabajo4 {
    public static void main(String[] args) {
        // Crear instancias de Estudiante para cada estudiante
        Estudiante estudiante1 = capturarDatosEstudiante(1);
        Estudiante estudiante2 = capturarDatosEstudiante(2);
        Estudiante estudiante3 = capturarDatosEstudiante(3);
        Estudiante estudiante4 = capturarDatosEstudiante(4);
        Estudiante estudiante5 = capturarDatosEstudiante(5);

        // Mostrar los detalles de los estudiantes
        System.out.println("\nDetalles de los estudiantes:");
        estudiante1.obtenerDetalles();
        estudiante2.obtenerDetalles();
        estudiante3.obtenerDetalles();
        estudiante4.obtenerDetalles();
        estudiante5.obtenerDetalles();
    }
    private static Estudiante capturarDatosEstudiante(int numeroEstudiante) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante " + numeroEstudiante + ": ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el teléfono del estudiante " + numeroEstudiante + ": ");
        String telefono = scanner.nextLine();

        System.out.println("Ingrese el promedio de notas del estudiante " + numeroEstudiante + ": ");
        double promedioNotas = scanner.nextDouble();
        scanner.nextLine();

        // Crear una instancia de Estudiante y retornarla
        return new Estudiante(nombre, telefono, promedioNotas);
    }
}

