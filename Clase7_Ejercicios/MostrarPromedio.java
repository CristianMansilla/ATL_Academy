package Clase7_Ejercicios;

import java.util.Scanner;

public class MostrarPromedio {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        float [] numeros = new float[5];
        float max = 0, min = 0, sumatoria = 0, promedio;

        for (int i=0; i<numeros.length; i++){
            System.out.println("Ingrese un número: ");
            numeros[i] = reader.nextFloat();
        }

        for (int i=0; i<numeros.length; i++){

            sumatoria += numeros[i];

            //Comparación para averiguar si es mayor o menor
            if (numeros[i]>=max || i == 0){
                max = numeros[i];
            }

            if (numeros[i]<=min || i == 0){
                min = numeros[i];
            }
        }
        promedio = sumatoria/numeros.length;

        System.out.println("El mayor número es: " + max);
        System.out.println("El menor números es: " + min);
        System.out.println("El promedio de los números es: " + promedio);

    }
}
