package Clase6_Ejercicios;

import java.util.Scanner;

public class AveriguarMayorYMenor {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        float num1, num2, num3;
        float max = Float.MAX_VALUE;
        float min = Float.MIN_VALUE;

        System.out.println("Ingrese el primer número:");
        num1 = reader.nextFloat();
        System.out.println("Ingrese el segundo número:");
        num2 = reader.nextFloat();
        System.out.println("Ingrese el tercer número:");
        num3 = reader.nextFloat();

        if (num1 > num2 && num1 > num3){
            max = num1;
        } else if (num2 > num1 && num2 > num3) {
            max = num2;
        }else {
            max = num3;
        }

        if (num1 < num2 && num1 < num3){
            min = num1;
        } else if (num2 < num1 && num2 < num3) {
            min = num2;
        }else {
            min = num3;
        }

        System.out.println("El número máximo es: " + max);
        System.out.println("El número mínimo es: " + min);
    }
}
