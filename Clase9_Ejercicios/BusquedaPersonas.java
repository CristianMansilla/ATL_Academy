package Clase9_Ejercicios;

import java.util.Scanner;

public class BusquedaPersonas {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String[] personas = {"Cristian Mansilla", "Luna Barrientos", "Lisandro Romero", "Gustavo Enrique"};

        System.out.println("Ingrese el nombre de la persona que desea buscar:");
        String busqueda = reader.nextLine();

        for(String persona:personas){
            if(persona.toLowerCase().contains(busqueda.toLowerCase())){
                System.out.println("Nombre: "+persona);
            }
        }
    }
}
