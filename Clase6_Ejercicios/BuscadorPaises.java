package Clase6_Ejercicios;

import java.util.Scanner;

public class BuscadorPaises {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Por favor ingresá un país:");
        String pais = reader.next();

        System.out.println("https://www.google.com/maps/search/"+pais);
    }
}
