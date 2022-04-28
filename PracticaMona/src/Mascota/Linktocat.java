package Mascota;

public class Linktocat extends Octocat{

    private String Habilidad;

    public Linktocat(String nombre, String color, String tamano, String especie) {
        super(nombre, color, tamano, especie);
        this.Habilidad = Habilidad;
    }

    public String Habilidad(){
        return "Atacar";
    }

    public String mostrarDatos() {
        return "Nombre: " + nombre + "\nColor: " + color + "\nTamano: " + tamano + "\nEspecie: " + especie + "\nHabilidad: " + Habilidad;

    }
}
