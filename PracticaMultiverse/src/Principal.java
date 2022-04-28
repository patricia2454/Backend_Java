public class Principal {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Dialog d = new Dialog();
        String str;

        Spiderman spiderman [] = new Spiderman[1];
        spiderman [0] = new Spiderman("Spiderman", "Azul y Rojo", "Resistencia", "Lanza Telaranas a sus enemigos y los enrolla");

        Gwen gwen [] = new Gwen[1];
        gwen [0] = new Gwen("SpiderGwen", "Azul, negro, blanco y rosa", "Piel Adherente", "Le lanza telaranas en el aire a sus enenigos");

        Woman woman [] = new Woman[1];
        woman [0] = new Woman("SpiderWoman" , "Rojo, amarillo y negro" , "Fuerza" , "Expulsa rayos atraves de sus manos");

        Noir noir [] = new Noir[1];
        noir[0] = new Noir("SpiderNoir" , "Negro" , "Maestro Investigador" , "Dispara con sus pistolas a sus oponentes");

        screen.out("Elige un personaje ", "Comic Sans Ms", 30, Colors.TurqouiseTopaz);
        screen.setVisible(true);
        str = d.readString("1. Spiderman 2. SpiderGwen  3. SpiderWoman  4. SpiderNoir");

        if (str.charAt(0) == '1') {
            screen.showImage("Spiderman.jpeg");
            screen.out(  spiderman[0].mostrarDatos1());
        }
        else if (str.charAt(0) == '2' ) {
            screen.showImage("Gwen.jpeg");
            screen.out(gwen[0].mostrarDatos2());
        }
        else if (str.charAt(0) == '3') {
            screen.showImage("Woman.jpeg");
            screen.out(woman[0].mostrarDatos3());

        }
        else if (str.charAt(0) == '4') {
            screen.showImage("Noir.jpeg");
            screen.out(noir[0].mostrarDatos4());
        }
        else {
            screen.out("\nLo que introdujo no es valido :/");
        }

    }
}
