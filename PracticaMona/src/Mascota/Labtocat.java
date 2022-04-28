package Mascota;

public class Labtocat extends Octocat{

    private String Habilidad;

    public Labtocat(String nombre, String color, String tamano, String especie) {
        super(nombre, color, tamano, especie);
        this.Habilidad = Habilidad;
    }

    public String Habilidad(){
        return "Descubrir";
    }


    public String mostrarDatos() {
        return  "Nombre: " + nombre + "\nColor: " + color + "\nTamano: " + tamano + "\nEspecie: " + especie;

    }
}
