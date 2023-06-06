package Clase5_Ejercicios;

import java.util.Scanner;

public class CalculadoraPropinas {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Ingrese el total de la cuenta: $");
        double totalCuenta = reader.nextDouble();

        System.out.println("Ingrese el porcentaje de propina que desea dejar: %");
        double porcPropina = reader.nextDouble();

        double propina = totalCuenta * (porcPropina / 100);

        System.out.println("El cliente dejará $" + propina + " de propina");
    }
}
