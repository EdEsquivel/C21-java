package B3;

public class Estudiante {
    Estudiante (String nombre, String telefono, double promedioNotas){
        this.nombre = nombre;
        this.telefono = telefono;
        this.promedioNotas = promedioNotas;
    }
    public Estudiante(){

    }
    private  String nombre;

    private  String telefono;

    private double promedioNotas;

    // Getters and Setters
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void estudiar() { System.out.println("estudiando..."); }

    // Método para obtener los detalles de un estudiante
    public void obtenerDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Promedio de Notas: " + promedioNotas);
        System.out.println("------------------------");
    }

}

/* import java.util.Scanner;

public class ProgramaEstudiantes {
    public static void main(String[] args) {
        // Crear un arreglo para almacenar los datos de los estudiantes
        Estudiante[] estudiantes = new Estudiante[5];

        // Capturar los datos de los estudiantes
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el teléfono del estudiante " + (i + 1) + ": ");
            String telefono = scanner.nextLine();

            System.out.println("Ingrese el promedio de notas del estudiante " + (i + 1) + ": ");
            double promedioNotas = scanner.nextDouble();
            scanner.nextLine(); // Consumir la nueva línea pendiente

            // Crear una instancia de Estudiante y almacenarla en el arreglo
            estudiantes[i] = new Estudiante(nombre, telefono);
            estudiantes[i].setPromedioNotas(promedioNotas);
        }

        // Mostrar los detalles de los estudiantes
        System.out.println("\nDetalles de los estudiantes:");
        for (Estudiante estudiante : estudiantes) {
            estudiante.obtenerDetalles();
        }
    }
}
*/
