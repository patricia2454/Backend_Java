package Mascota;

public class Scubatocat extends Octocat {

    private String Habilidad;

    public Scubatocat(String nombre, String color, String tamano, String especie) {
        super(nombre, color, tamano, especie);
        this.Habilidad = Habilidad;
    }

    public String Habilidad(){
        return "Bucear";
    }



    public String mostrarDatos() {
        return "Nombre: " + nombre + "\nColor: " + color + "\nTamano: " + tamano + "\nEspecie: " + especie + "\nHabilidad: " + Habilidad;

    }
}
