package Clase5_Ejercicios;

import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese el precio original de un producto: $");
        double precio = reader.nextDouble();

        System.out.println("Ingrese el porcentaje de descuento: %");
        double descuento = reader.nextDouble();

        double precioFinal = precio - (precio * descuento / 100);

        System.out.println("El precio final es: $" + precioFinal);
    }
}
