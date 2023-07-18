package Clase14_Ejercicios;

import java.util.Scanner;

public class AdivinarPalabra {
    public static void main(String[] args) {
        ejecutarJuegoAdivinarLaPalabra();
    }

    private static void ejecutarJuegoAdivinarLaPalabra() {
        Scanner reader = new Scanner(System.in);
        String palabraAdivinar = "Elefante";
        System.out.println("Adivina la palabra:");
        System.out.println("Pista: Es un animal grande con trompa.");
        String palabraUsuario = reader.next();
        int intentos=3;
        boolean adivino = false;
        while(intentos>1 || adivino == false){
            if(palabraUsuario.equalsIgnoreCase(palabraAdivinar)){
                System.out.println("Haz adivinado la palabra");
                adivino = true;
                intentos = 0;
            }else {
                intentos--;
                System.out.println("Palabra incorrecta!");
                System.out.println("Te queda " + intentos + " intentos.");
                System.out.println("\nAdivina la palabra:");
                System.out.println("Pista: Es un animal grande con trompa.");
                palabraUsuario = reader.next();

            }
        }
        if(adivino == false){
            System.out.println("Game Over!!!");
        }
    }
}
