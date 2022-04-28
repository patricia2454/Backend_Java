package Mascota;

public class Momtocat extends Octocat{
    private String Habilidad;

    public Momtocat(String nombre, String color, String tamano, String especie) {
        super(nombre, color, tamano, especie);
        this.Habilidad = Habilidad;
    }

    public String Habilidad(){
        return "Cuidar";
    }


    public String mostrarDatos() {
        return "Nombre: " + nombre + "\nColor: " + color + "\nTamano: " + tamano + "\nEspecie: " + especie + "\nHabilidad: " + Habilidad;

    }
}
