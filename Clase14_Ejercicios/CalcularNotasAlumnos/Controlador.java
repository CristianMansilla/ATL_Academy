package Clase14_Ejercicios.CalcularNotasAlumnos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controlador {
    public void ejecutarPrograma(){
        Scanner reader = new Scanner(System.in);
        Alumno alumno1 = new Alumno("Cristian", "Mansilla");
        List<Double> notasAlumno1 = new ArrayList();

        System.out.println("¿Cuantas notas desea cargar?");
        int cantNotas = reader.nextInt();

        for(int i=0; i<cantNotas; i++){
            System.out.println("Ingrese nota " + (i+1) + ":");
            double nota = reader.nextDouble();
            notasAlumno1.add(nota);
        }

        alumno1.setNotas(notasAlumno1);

        alumno1.imprimirMensajePromedio();
    }
}
