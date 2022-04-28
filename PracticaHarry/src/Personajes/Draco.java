package Personajes;

public class Draco {
    public static void main(String[] args) {
        def();
    }
    public static void def() {
        Caracteristicas Mago = new Caracteristicas();
        Mago.setNombre("Draco");
        Mago.setApellido("Malfoy");
        Mago.setCasa("Slytherin");
        Mago.setGenero("Masculino");
        Mago.setBoggart("Voldemort");
        Mago.setPatronus("Labrador");
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
