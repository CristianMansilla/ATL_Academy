package Clase6_Ejercicios;

import java.util.Scanner;

public class BuscadorTweets {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.printf("Ingrese el nombre de una celebridad (una sola palabra):");
        String celebridad = reader.next();

        System.out.println("https://twitter.com/search?q="+celebridad);
    }
}
