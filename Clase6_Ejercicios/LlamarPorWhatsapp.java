package Clase6_Ejercicios;

import java.util.Scanner;

public class LlamarPorWhatsapp {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Ingrese el número de teléfono con el que se desea comunicar (sin espacios)");
        System.out.println("Por ejemplo: 5493541539405");
        System.out.println("Teléfono: ");
        String telefono = reader.next();

        System.out.println("https://api.whatsapp.com/send?phone="+telefono);
    }
}
