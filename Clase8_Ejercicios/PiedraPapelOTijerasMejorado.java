package Clase8_Ejercicios;

import java.util.Scanner;

public class PiedraPapelOTijerasMejorado {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String[] opciones = {"piedra", "papel", "tijeras"};
        String opcionUsuario;
        String opcionMaquina;
        int victoriaUsuario = 0, victoriaMaquina = 0;

        mensajeInicial();

        while(victoriaUsuario<3 && victoriaMaquina<3){
            int indiceEleccionMaquina = (int)(Math.random() * 3);
            opcionMaquina = opciones[indiceEleccionMaquina];
            //System.out.println(opcionMaquina);

            opcionUsuario = getOpcionUsuario(reader, opciones);

            //Usuario=1  Maquina=1 - Empate
            //Usuario=1  Maquina=2 - Gana Máquina
            //Usuario=1  Maquina=3 - Gana Usuario

            //Usuario=2  Maquina=1 - Gana Usuario
            //Usuario=2  Maquina=2 - Empate
            //Usuario=2  Maquina=3 - Gana Máquina

            //Usuario=3  Maquina=1 - Gana Máquina
            //Usuario=3  Maquina=2 - Gana Usuario
            //Usuario=3  Maquina=3 - Empate

            if (opcionUsuario.equals(opcionMaquina)) {
                System.out.println("U:"+opcionUsuario+" - M:"+opcionMaquina+" = Empate");
            } else if ((opcionUsuario.equals("piedra") && opcionMaquina.equals("tijeras"))
                    || (opcionUsuario.equals("papel") && opcionMaquina.equals("piedra"))
                    || (opcionUsuario.equals("tijeras") && opcionMaquina.equals("papel"))) {
                System.out.println("U:"+opcionUsuario+" - M:"+opcionMaquina+" = Ganaste");
                victoriaUsuario++;
            } else {
                System.out.println("U:"+opcionUsuario+" - M:"+opcionMaquina+" = Perdiste");
                victoriaMaquina++;
            }

            System.out.println("Usuario: " + victoriaUsuario + " - Máquina: " + victoriaMaquina);
        }

        mensajeFinal(victoriaUsuario, victoriaMaquina);
    }

    private static void mensajeInicial() {
        System.out.println("Seras capaz de ganarle a la máquina al piedra, papel o tijera?");
        System.out.println("Se juega a un total de 3 victorias.");
        System.out.println("\n----A JUGAR----");
    }

    private static void mensajeFinal(int victoriaUsuario, int victoriaMaquina) {
        if(victoriaUsuario > victoriaMaquina){
            System.out.println("\nGanaste la partida. Felicitaciones!!!");
        } else if (victoriaMaquina > victoriaUsuario) {
            System.out.println("\nHaz perdido contra la máquina!");
        }else {
            System.out.println("Error!");
        }
    }

    private static String getOpcionUsuario(Scanner reader, String[] opciones) {
        String opcionUsuario;
        System.out.println("\nEscoga una opción:");
        System.out.println("1) Piedra");
        System.out.println("2) Papel");
        System.out.println("3) Tijera");
        System.out.println("Opción:");
        int indiceOpcionUsuario = reader.nextInt();
        opcionUsuario = opciones[indiceOpcionUsuario-1];
        return opcionUsuario;
    }
}
