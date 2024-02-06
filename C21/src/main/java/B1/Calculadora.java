package B1;

//Calculadora
//Hacer una calculadora pidiendo 2 datos int al usuario por consola
//Hacer las 4 operaciones Basicas

// CALCULADORA

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        // Crear un objeto Scanner para leer la entrada del teclado

        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número

        System.out.print("Ingrese su primer número: ");

        // Leer la entrada del usuario

        int num1 = scanner.nextInt();

        // Pedir segundo número

        System.out.print("Ingrese su segundo número: ");

        // Leer entrada

        int num2 = scanner.nextInt();

        // Mostrar resultado al usuario

        System.out.println("Suma: " + num1 + "+" + num2 + " = " + (num1 + num2));
        System.out.println("Resta: " + num1 + "-" + num2 + " = " + (num1 - num2));
        System.out.println("Multiplicación: " + num1 + "x" + num2 + " = " + (num1 * num2));
        System.out.println("División: " + num1 + "/" + num2 + " = " + (num1 / num2));

        // Cerrar el Scanner

        scanner.close();

    }

}
