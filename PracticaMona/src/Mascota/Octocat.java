package Mascota;

public class Octocat {
    protected String nombre, color, tamano, especie;

    public Octocat(String nombre, String color, String tamano, String especie) {
        this.nombre = nombre;
        this.color = color;
        this.tamano = tamano;
        this.especie = especie;
    }
    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public String getTamano() {
        return tamano;
    }

    public String getEspecie() {
        return especie;
    }
    public String mostrarDatos() {
        return "Nombre: " + nombre + "\nColor: " +color+ "\nTamano: " + tamano + "\nEspecie: " + especie;
    }
}
