package Clase6_Ejercicios;

import java.util.Scanner;

public class CalcularPromedio {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        float num1, num2, num3, promedio;
        System.out.println("Ingrese el primer número:");
        num1 = reader.nextFloat();
        System.out.println("Ingrese el segundo número:");
        num2 = reader.nextFloat();
        System.out.println("Ingrese el tercer número:");
        num3 = reader.nextFloat();
        promedio = (num1 + num2 + num3)/3;
        System.out.println("Promedio: " + promedio);
    }
}
