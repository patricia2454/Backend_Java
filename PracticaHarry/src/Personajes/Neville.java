package Personajes;

public class Neville {
    public static void main(String[] args) {
        def();
    }
    public static void def() {
        Caracteristicas Mago = new Caracteristicas();
        Mago.setNombre("Neville");
        Mago.setApellido("Lomgbottom");
        Mago.setCasa("Gryffindor");
        Mago.setGenero("Masculino");
        Mago.setBoggart("Severus Snape");
        Mago.setPatronus("No corporeo");
        String msg = "Soy un mago con estas caracteristicas: ";
        msg += "\nNombre: "+Mago.getNombre();
        msg += "\nApellido: "+Mago.getApellido();
        msg += "\nCasa: "+Mago.getCasa();
        msg += "\nGenero: "+Mago.getGenero();
        msg += "\nBoggart: "+Mago.getBoggart();
        msg += "\nPatronus: "+Mago.getPatronus();

        System.out.println(msg);
    }
}
