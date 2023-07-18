package Clase14_Ejercicios.Spotify;

public class Cancion {
    private String titulo;
    private String artista;
    private int duracion;

    public Cancion(String titulo, String artista, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}
