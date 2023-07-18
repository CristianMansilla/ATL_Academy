package Clase14_Ejercicios;

import java.util.Scanner;

public class CalculadoraInteresCompuesto {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        float inicial, adicionAnual, cantidadAnios, interes, cantidadFinal;

        System.out.println("Ingrese el capital inicial:");
        inicial = reader.nextFloat();
        System.out.println("Ingrese la adición anual:");
        adicionAnual = reader.nextFloat();
        System.out.println("Ingrese la cantidad de años:");
        cantidadAnios = reader.nextFloat();
        System.out.println("Ingrese la tasa de interés (%):");
        interes = reader.nextFloat();

        cantidadFinal = inicial;

        for(int i = 0; i<cantidadAnios; i++){
            cantidadFinal += adicionAnual;
            cantidadFinal += cantidadFinal * interes / 100;
        }

        System.out.println("Al finalizar vas a tener: $" + cantidadFinal);
    }
}
