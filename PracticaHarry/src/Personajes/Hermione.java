package Personajes;

public class Hermione {
    public static void main(String[] args) {
        def();
    }
    public static void def() {
        Caracteristicas Mago = new Caracteristicas();
        Mago.setNombre("Hermione");
        Mago.setApellido("Granger");
        Mago.setCasa("Gryffindor");
        Mago.setGenero("Femenino");
        Mago.setBoggart("Mc Gonagall");
        Mago.setPatronus("Nutria");
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
