public class Woman {
    protected String nombre3, color3, habilidades3, ataques3;

    public Woman(String nombre3, String color3, String habilidades3, String ataques3) {
        this.nombre3 = nombre3;
        this.color3 = color3;
        this.habilidades3 =habilidades3;
        this.ataques3 = ataques3;
    }
    public String getNombre3() {
        return nombre3;
    }

    public String getColor3() {
        return color3;
    }

    public String getHabilidades3() {
        return habilidades3;
    }

    public String getAtaques3() {
        return ataques3;
    }
    public String mostrarDatos3() {
        return "\nNombre: " + nombre3 + "\nColor: " +color3+ "\nHablidades: " + habilidades3 + "\nAtaques: " + ataques3;
    }
}
