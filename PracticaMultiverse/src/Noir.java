public class Noir {
    protected String nombre4, color4, habilidades4, ataques4;

    public Noir(String nombre4, String color4, String habilidades4, String ataques4) {
        this.nombre4 = nombre4;
        this.color4 = color4;
        this.habilidades4 =habilidades4;
        this.ataques4 = ataques4;
    }
    public String getNombre4() {
        return nombre4;
    }

    public String getColor4() {
        return color4;
    }

    public String getHabilidades4() {
        return habilidades4;
    }

    public String getAtaques4() {
        return ataques4;
    }
    public String mostrarDatos4() {
        return "\nNombre: " + nombre4 + "\nColor: " +color4 + "\nHablidades: " + habilidades4 + "\nAtaques: " + ataques4;
    }
}
