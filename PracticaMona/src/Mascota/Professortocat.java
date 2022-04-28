package Mascota;

public class Professortocat extends Octocat{
    private String Habilidad;

    public Professortocat(String nombre, String color, String tamano, String especie) {
        super(nombre,color, tamano, especie);
        this.Habilidad = Habilidad;
    }

    public String Habilidad(){
        return "Enseñar";
    }


    public String mostrarDatos() {
        return "Nombre: " + nombre + "\nColor: " + color + "\nTamano: " + tamano + "\nEspecie: " + especie + "\nHabilidad: " + Habilidad;

    }
}
