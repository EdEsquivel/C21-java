package B5;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Trabajo6 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Pedir la fecha de nacimiento al usuario
            System.out.println("Ingrese su fecha de nacimiento en formato yyyy-MM-dd:");
            String fechaNacimientoStr = scanner.nextLine();

            // Convertir la cadena de fecha a LocalDate
            LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr, DateTimeFormatter.ISO_DATE);

            LocalDate fechaActual = LocalDate.now();

            // Calcular la edad
            int edad = calcEdad(fechaNacimiento, fechaActual);

            System.out.println("Su edad es: " + edad + " años.");

            scanner.close();
        }

        // Método para calcular la edad
        private static int calcEdad(LocalDate fechaNacimiento, LocalDate fechaActual) {
            int edad = fechaActual.getYear() - fechaNacimiento.getYear();

            // Ajustar la edad si aún no ha cumplido años en este año
            if (fechaNacimiento.getDayOfYear() > fechaActual.getDayOfYear()) {
                edad--;
            }

            return edad;
        }
    }
