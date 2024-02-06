package B2;

public class Celular {
    public String marca;
    public String modelo;
    private int memoria;
    private boolean isEncendido;
    public int getMemoria() {
        return memoria;
    }
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    // Constructor de la clase Celular
    public Celular(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.isEncendido = false; // Por defecto, el celular está apagado al crearlo
    }

    // Método para encender el celular
    public void encender() {
        if (!isEncendido) {
            isEncendido = true;
            System.out.println("Encendiendo celular...");
        } else {
            System.out.println("El celular ya está encendido.");
        }
    }

    // Método para apagar el celular
    public void apagar() {
        if (isEncendido) {
            isEncendido = false;
            System.out.println("Apagando el celular...");
        } else {
            System.out.println("El celular ya está apagado.");
        }
    }

    // Método para verificar si el celular está encendido
    public boolean isEncendido() {
        return isEncendido;
    }
}
