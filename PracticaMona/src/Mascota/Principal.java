package Mascota;

import java.security.spec.RSAOtherPrimeInfo;

public class Principal {
    public static void main(String[] args) {
        Octocat octocats [] = new Octocat [7];

        octocats [0] = new Octocat("Octocat", "Negro", "Pequeño", "Gato");
        octocats [1] = new Labtocat( "Labtocat", "Morado", "Grande", "Gato");
        octocats [2] = new Momtocat("Momtocat", "cafe", "Mediano", "Gata");
        octocats [3] = new Professortocat("Professortocat", "Azul" ,"Pequeño" ,"Gato" );
        octocats [4] = new Scubatocat("Scubatocat", "Amarillo", "Mediano", "Gato");
        octocats [5] = new Manufacturetocat("Manufacturetocat", "Rojo", "Grande", "Gato");
        octocats [6] = new Linktocat("Linktocat","Verde", "Mediano", "Gato");

        for(Octocat octocat: octocats) {
            System.out.println(octocat.mostrarDatos());
            System.out.println("");

        }
    }
}
