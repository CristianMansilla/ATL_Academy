package Clase6_Ejercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PiedraPapelOTijeras {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int victoriaUsuario = 0, victoriaMaquina = 0;

        System.out.println("Seras capaz de ganarle a la máquina al piedra, papel o tijera?");
        System.out.println("Se juega a un total de 3 victorias.");
        System.out.println("\n----A JUGAR----");

        while(victoriaUsuario<3 && victoriaMaquina<3){
            int opcionMaquina = (int)(Math.random() * 3)+1;
            int opcionUsuario;

            //System.out.println(opcionMaquina);

            System.out.println("\nEscoga una opción:");
            System.out.println("1) Piedra");
            System.out.println("2) Papel");
            System.out.println("3) Tijera");
            System.out.println("Opción:");
            opcionUsuario = reader.nextInt();

            //Usuario=1  Maquina=1 - Empate
            //Usuario=1  Maquina=2 - Gana Máquina
            //Usuario=1  Maquina=3 - Gana Usuario

            //Usuario=2  Maquina=1 - Gana Usuario
            //Usuario=2  Maquina=2 - Empate
            //Usuario=2  Maquina=3 - Gana Máquina

            //Usuario=3  Maquina=1 - Gana Máquina
            //Usuario=3  Maquina=2 - Gana Usuario
            //Usuario=3  Maquina=3 - Empate

            switch (opcionUsuario){
                case 1:
                    if (opcionMaquina == 1){
                        System.out.println("U:Piedra - M:Piedra = Empate");
                    }else if (opcionMaquina == 2){
                        System.out.println("U:Piedra - M:Papel = Gana Máquina");
                        victoriaMaquina++;
                    }else {
                        System.out.println("U:Piedra - M:Tijera = Gana Usuario");
                        victoriaUsuario++;
                    }
                    break;
                case 2:
                    if (opcionMaquina == 1){
                        System.out.println("U:Papel - M:Piedra = Gana Usuario");
                        victoriaUsuario++;
                    }else if (opcionMaquina == 2){
                        System.out.println("U:Papel - M:Papel = Empate");
                    }else {
                        System.out.println("U:Papel - M:Tijera = Gana Máquina");
                        victoriaMaquina++;
                    }
                    break;
                case 3:
                    if (opcionMaquina == 1){
                        System.out.println("U:Tijera - M:Piedra = Gana Máquina");
                        victoriaMaquina++;
                    }else if (opcionMaquina == 2){
                        System.out.println("U:Tijera - M:Papel = Gana Usuario");
                        victoriaUsuario++;
                    }else {
                        System.out.println("U:Tijera - M:Tijera = Empate");
                    }
                    break;
                default:
                    System.out.println("Opción ingresada incorrecta!");
                    break;
            }
            System.out.println("Usuario: " + victoriaUsuario + " - Máquina: " + victoriaMaquina);
        }

        if(victoriaUsuario>victoriaMaquina){
            System.out.println("\nGanaste la partida. Felicitaciones!!!");
        } else if (victoriaMaquina>victoriaUsuario) {
            System.out.println("\nHaz perdido contra la máquina!");
        }else {
            System.out.println("Error!");
        }


    }
}
