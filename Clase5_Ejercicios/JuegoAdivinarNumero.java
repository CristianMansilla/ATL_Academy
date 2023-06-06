package Clase5_Ejercicios;

import java.util.Scanner;

public class JuegoAdivinarNumero {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double numAleatorio = (int)(Math.random() * 10);

        //System.out.println(numAleatorio);

        System.out.println("Adivine el número:");
        Integer num = reader.nextInt();

        if(numAleatorio == num){
            System.out.println("Adivinaste!!!");
        }else{
            System.out.println("No has logrado adivinar el número");
        }
    }
}
