package Clase14_Ejercicios.Spotify;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    public void ejecutarPrograma(){
        Scanner reader = new Scanner(System.in);
        Cancion track1 = new Cancion("Baby Hello", "Raw Alejandro", 130);
        Cancion track2 = new Cancion("Los del espacio", "Lit Killah", 240);

        Playlist altaPrevia = new Playlist("Alta Previa");

        altaPrevia.agregarCancion(track1);
        altaPrevia.agregarCancion(track2);

        System.out.println("\nReproducción iniciada:");

        String opcion;
        boolean exit;

        do{
            System.out.print("Presione Enter para reproducir la siguiente canción (o 'q' para salir): ");
            opcion = reader.nextLine();
            if (opcion.equalsIgnoreCase("q")) {
                break;
            }
            exit = altaPrevia.reproducirSiguienteCancion();
        }while (!(exit == true));

        System.out.println("Fin de la reproducción.");
    }
}
