public class Gwen {
    protected String nombre2, color2, habilidades2, ataques2;

    public Gwen(String nombre2, String color2, String habilidades2, String ataques2) {
        this.nombre2 = nombre2;
        this.color2 = color2;
        this.habilidades2 =habilidades2;
        this.ataques2 = ataques2;
    }
    public String getNombre2() {
        return nombre2;
    }

    public String getColor2() {
        return color2;
    }

    public String getHabilidades2() {
        return habilidades2;
    }

    public String getAtaques1() {
        return ataques2;
    }
    public String mostrarDatos2() {
        return "\nNombre: " + nombre2 + "\nColor: " +color2+ "\nHablidades: " + habilidades2 + "\nAtaques: " + ataques2;
    }
}
