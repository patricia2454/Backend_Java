import java.io.FileOutputStream;
import java.util.Timer;

public class Principal {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Dialog d = new Dialog();
        String str0 = "2";
        String str1;
        String str2 = "";
        String str3 = "";
        String str4 = "";
        str1 = "";
        String juego;
        screen.setVisible(true);
        str0 = d.readString("Iniciar Comic = 1    Salir = 2");
        if (str0.charAt(0) == '1') {
            screen.showImage("Fondo_de_Bikini_imagen (1).png");
            do {
                do {
                    str4 = d.readString("Bob Esponja: Patricio...   \n" +
                            "    Patricio: ¿Qué?\n" +
                            "    Bob esponja: Conozco algo más rico que todo en este mundo\n" +
                            "    Patricio: ¿Y qué es?\n" +
                            "    Bob esponja: Las Kangreburguers\n" +
                            "    1. Seguir"    );
                }while (str4.charAt(0) == '-');
                do {
                    str3 = d.readString("Bob esponja: ¡Pero lo prometimos!\n" +
                            "    Patricio: Yo crucé los dedos\n" +
                            "    Bob esponja: Patricio, tu no tienes dedos.\n" +
                            "    1. Seguir");

                }while (str3.charAt(0) == '-');
                do {
                    str4 = d.readString("Bob esponja: Hasta luego, Arenita. Tengo que ir a... cortarme el pelo.\n" +
                            "    Arenita: Bob esponja no tiene pelo... (En asombro) ¿O si tiene?\n" +
                            "    1. Seguir");
                }while (str4.charAt(0) == '-');
                do {
                    str0 = d.readString("Bob (a Arenita): El otro día Calamardo alabó nuestras habilidades de supervivencia...\n" +
                            "    Calamardo (en la memoria de Bob): ¡Es más difícil deshacerse de ustedes dos que de las cucarachas!\n" +
                            "    1. terminar de leer 2. regresar al principio");
                }while (str0.charAt(0) == '-');
            }while (str0.charAt(0) == '2');

        }
        else {

            screen.out("Adios ", "Comic Sans Ms", 30, Colors.TurqouiseTopaz);
        }

    }
}
