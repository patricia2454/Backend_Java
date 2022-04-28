public class Spiderman {
    protected String nombre1, color1, habilidades1, ataques1;

    public Spiderman(String nombre1, String color1, String habilidades1, String ataques1) {
        this.nombre1 = nombre1;
        this.color1 = color1;
        this.habilidades1 =habilidades1;
        this.ataques1 = ataques1;
    }
    public String getNombre1() {
        return nombre1;
    }

    public String getColor1() {
        return color1;
    }

    public String getHabilidades1() {
        return habilidades1;
    }

    public String getAtaques1() {
        return ataques1;
    }
    public String mostrarDatos1() {
        return "\nNombre: " + nombre1 + "\nColor: " +color1+ "\nHablidades: " + habilidades1 + "\nAtaques: " + ataques1;
    }
}
