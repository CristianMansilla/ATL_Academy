package Clase14_Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class AmigoInvisible {
    public static void main(String[] args) {
        jugarAlAmigoInvisible();
    }

    private static void jugarAlAmigoInvisible() {
        Scanner reader = new Scanner(System.in);
        System.out.println("¿Cuantas personas van a jugar al amigo secreto?");
        int cantidadPersonas = reader.nextInt();
        String[] listaNombres = new String[cantidadPersonas];


        ingresarNombreJugadores(reader, cantidadPersonas, listaNombres);

        mezclarNombreJugadores(listaNombres);

        String[] agasajados = new String[cantidadPersonas];

        mostrarAmigoInvisibleAJugadores(reader, cantidadPersonas, listaNombres, agasajados);
    }


    private static void ingresarNombreJugadores(Scanner reader, int cantidadPersonas, String[] listaNombres) {
        for (int i = 0; i< cantidadPersonas; i++){
            System.out.println("Ingrese el nombre de una persona:");
            listaNombres[i] = reader.next();
        }
    }

    private static void mezclarNombreJugadores(String[] listaNombres) {
        int index;
        String temp;
        for (int i = listaNombres.length - 1; i > 0; i--) {
            index = (int) (Math.random() * (i + 1));
            temp = listaNombres[index];
            listaNombres[index] = listaNombres[i];
            listaNombres[i] = temp;
        }
    }

    private static void mostrarAmigoInvisibleAJugadores(Scanner reader, int cantidadPersonas, String[] listaNombres, String[] agasajados) {
        for (int i = 0; i < cantidadPersonas; i++){
            String nombrePersona = listaNombres[i];
            System.out.println("Que se acerque " + nombrePersona + " a la computadora y escriba LISTO para continuar.");
            reader.next();
            System.out.println("Le tienes que hacer un regalo a " + obtenerAmigoInvisible(listaNombres, listaNombres[i]) + ". Escribe Listo para continuar.");
            reader.next();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
    }

    private static String obtenerAmigoInvisible(String[] participantes, String participanteActual) {
        int indiceParticipanteActual = Arrays.asList(participantes).indexOf(participanteActual);
        int indiceAmigoInvisible = (indiceParticipanteActual + 1) % participantes.length;
        // Si el amigo invisible es el mismo participante, avanzar un índice más
        if (participantes[indiceAmigoInvisible].equals(participanteActual)) {
            indiceAmigoInvisible = (indiceAmigoInvisible + 1) % participantes.length;
        }
        return participantes[indiceAmigoInvisible];
    }
}
