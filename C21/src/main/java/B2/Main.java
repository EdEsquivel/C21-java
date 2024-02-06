package B2;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persona persona= new Persona(32,'M');
        Celular celular1= new Celular("Samsung", "Galaxy S22");

        System.out.println(persona.getEdad() >= 18 ? "Es mayor de edad" : "Es menor de edad");


        if ((persona.getEdad() >= 18) && (persona.getGenero()=='F')) {
            System.out.println("Es mujer mayor de edad");
        } else if ((persona.getEdad() <18) && (persona.getGenero()=='F')) {
            System.out.println("Es mujer menor de edad");
        } else if ((persona.getEdad() >= 18) && (persona.getGenero()=='M')) {
            System.out.println("Es hombre mayor de edad");
        } else if ((persona.getEdad() < 18) && (persona.getGenero()=='M')) {
            System.out.println("Es hombre menor de edad");
        }


        int diaDelaSemana = 2;

        String nombreDia= switch (diaDelaSemana){
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "sabado";
            case 7 -> "Doming";
            default -> "Dia no válido";
        };
        persona.setProfesion("Ingeriero");
        persona.setEstatura("1.75mt");

        System.out.print("Cuál es su nombre?: ");
        String nombre = scanner.nextLine();
        persona.setNombre(nombre);

        System.out.println("Feliz " + nombreDia + ", " + persona.getProfesion() + " " + persona.getNombre());
        persona.trabajar();
        System.out.println("Celular encendido? " + celular1.isEncendido());
        persona.descansar();
        System.out.println("Usted tiene un celular " + celular1.marca + " " + celular1.modelo);
        celular1.encender();
        System.out.println("Celular encendido? " + celular1.isEncendido());
        persona.hablar();
        scanner.close();
    }
}
