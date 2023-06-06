package Clase5_Ejercicios;

import java.util.Scanner;

public class ConversorMillasKilometros {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Ingrese la distancia en millas:");
        double millas = reader.nextDouble();
        double kilometros = millas * 1.60934;

        System.out.println(millas + " millas" + " = " + kilometros + " KM");
    }
}
