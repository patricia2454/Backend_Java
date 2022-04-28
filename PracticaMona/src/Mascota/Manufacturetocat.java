package Mascota;

public class Manufacturetocat extends Octocat{

    private String Habilidad;

    public Manufacturetocat(String nombre, String color, String tamano, String especie) {
        super(nombre, color, tamano, especie);
        this.Habilidad = Habilidad;
    }

    public String Habilidad(){
        return "Producir";
    }

    public String mostrarDatos() {
        return "Nombre: " + nombre + "\nColor: " + color + "\nTamano: " + tamano + "\nEspecie: " + especie + "\nHabilidad: " + Habilidad;

    }
}
