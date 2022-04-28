package Personajes;

public class Harry {
    public static void main(String[] args) {
        def();
    }
    public static void def() {
        Caracteristicas Mago = new Caracteristicas();
        Mago.setNombre("Harry");
        Mago.setApellido("Potter");
        Mago.setCasa("Gryffindor");
        Mago.setGenero("Masculino");
        Mago.setBoggart("Dementor");
        Mago.setPatronus("Ciervo");
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
