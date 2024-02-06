package B4;

import B3.Estudiante;

import java.util.Arrays;
import java.util.Scanner;

//Realizar el trabajo 4 con una estructura ciclica

public class Trabajo5 {
    public static void main(String[] args) {
        Estudiante[] miArreglo = new Estudiante[5];

        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < miArreglo.length ; i++) {
            Estudiante est = new Estudiante();
            System.out.print("Ingrese nombre de estudiante " + (i + 1) + ": " );
            est.setNombre(scanner.next());
            System.out.print("Ingrese telefono de estudiante " + (i + 1) + ": " );
            est.setTelefono(scanner.next());
            System.out.print("Ingrese promedio de notas de estudiante " + (i + 1) + ": " );
            est.setPromedioNotas(scanner.nextDouble());
            miArreglo[i]=est;
        }

        Arrays.stream(miArreglo).forEach(est->System.out.println("Estudiante: " + est.getNombre()+" --- "+ "Teléfono: " + est.getTelefono()+" --- "+ "Promedio de notas: " + est.getPromedioNotas()));
    }

}
