package Clase5_Ejercicios;

import java.util.Scanner;

public class CalculadoraEdadPerros {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Ingrese la edad de su perro en años humanos:");
        Integer edad = reader.nextInt();
        Integer edadPerro = edad*7;

        System.out.println("Su perro tiene: " + edadPerro + " años perrunos");

    }
}
