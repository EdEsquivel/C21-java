package B2;

public class Persona {


    Persona(int edad,char genero){
        this.edad=edad;
        this.genero=genero;
    }
    public Persona(){

    }

    private  String nombre;
    private  String estatura;
    private  int edad;
    private  char genero;
    private   boolean tienePelo;
    private  String colorPelo;
    private  String profesion;

    // Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public boolean isTienePelo() {
        return tienePelo;
    }

    public void setTienePelo(boolean tienePelo) {
        this.tienePelo = tienePelo;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }


    public void respirar() { System.out.println("respire."); }
    public void trabajar() { System.out.println("trabajando..."); }
    public void descansar() { System.out.println("descansando..."); }
    public void hablar(){
            System.out.println("hablar.");
        }
    private void conducir(){
            System.out.println("conducir.");
        }
    private void dormir(){
            System.out.println("dormir.");
        }


}
