package Clase14_Ejercicios.Spotify;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nombre;
    private List<Cancion> listas;
    private int indiceReproduccion;

    public Playlist(String nombre) {
        this.nombre = nombre;
        this.listas = new ArrayList<>();
        this.indiceReproduccion = 0;
    }

    public void agregarCancion(Cancion track){
        listas.add(track);
    }

    public boolean reproducirSiguienteCancion() {
        boolean salir = false;
        if (listas.isEmpty()) {
            System.out.println("La lista de reproducción está vacía.");
            salir = true;
        } else if (indiceReproduccion >= listas.size()) {
            System.out.println("La reproducción ha llegado al final de la lista.");
            salir = true;
        } else {
            Cancion cancionActual = listas.get(indiceReproduccion);
            System.out.println("Reproduciendo: " + cancionActual.toString());
            indiceReproduccion++;
        }
        return  salir;
    }
}
