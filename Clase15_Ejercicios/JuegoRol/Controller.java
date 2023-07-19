package Clase15_Ejercicios.JuegoRol;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public void ejecutarJuego(){
        List<Personaje> personajes = new ArrayList<>();

        Mago magix = new Mago();
        Guerrero guerrex = new Guerrero();

        System.out.println("Mago: " + magix.getHp() + "HP");
        System.out.println("Guerrero: " + guerrex.getHp() + "HP");
        System.out.println("El mago lanza un hechizo");
        guerrex.recibirDanio(magix.lanzarHechizo());
        System.out.println("Guerrero: " + guerrex.getHp() + "HP");


        //Ejemplo creado en clases - puedo implementar lo mismo para cada personaje en particular.
        Personaje personaje1 = new Personaje();
        personaje1.recibirDanio(50);

        Item casco = new Item();
        casco.setDefensa(5);

        Item escudo = new Item();
        escudo.setDefensa(30);

        Item botas = new Item();
        botas.setDefensa(2);

        Item espada = new Item();
        espada.setAtaque(60);

        personaje1.getItems().add(casco);
        personaje1.getItems().add(escudo);
        personaje1.getItems().add(botas);
        personaje1.getItems().add(espada);


        Personaje personaje2 = new Personaje();
        Item escudoMadera = new Item();
        escudoMadera.setDefensa(15);
        personaje2.getItems().add(escudoMadera);

        int ataque = personaje1.getAtaqueTotal();
        int puntosDanio = personaje2.getDefensaTotal() - ataque;
        personaje2.recibirDanio(puntosDanio);
    }
}
